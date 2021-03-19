package hometask_3;


public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;


    public void add(E value) {
        if (value == null) return;
        Node<E> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
            size += 1;
        } else {
            last.next = newNode;
            last = newNode;
            size += 1;
        }
    }

    public void add(int index, E value) {
        if (index < 0 || value == null || index > size) return;
        Node<E> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
            size += 1;
        } else {
            Node<E> current = first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size += 1;
        }

    }


    public boolean contains(E value) {
        if(size == 0) return false;
        Node<E> current = first;
        while(current != null){
            if(current.value.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        Node<E> element = getNodeByIndex(index);
        return element == null ? null : element.value;
    }

    public E remove(int index) {
        if (index >= size || index < 0) return null;
        Node<E> deletedNode = null;
        if(index == 0) {
            deletedNode = first;
            first = deletedNode.next;
            size--;
            return deletedNode.value;
        }
        if(index == size - 1){
            deletedNode = last;
            Node<E> previousElem = getNodeByIndex(size - 2);
            previousElem.next = null;
            size--;
            return deletedNode.value;
        }
        Node<E> previousNode = getNodeByIndex(index - 1);
        deletedNode = previousNode.next;
        previousNode.next = deletedNode.next;
        size--;
        return deletedNode.value;
    }

    public boolean remove(E value) {
        if (!contains(value)) return false;
        if (first.value == value){
            first = first.next;
            size--;
            return true;
        }
        Node<E> current = first.next;
        Node<E> previous = first;
        while(current != null){
            if(current.value == value){
                previous.next = current.next;
                size--;
                return true;
            }else {
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

    private Node<E> getNodeByIndex(int index){
        if (index >= size || index < 0) return null;
        Node<E> current = first;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void print() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("MyLinkedList [");
        Node<E> current = first;
        while (current != null) {
            sBuilder.append(current.value);
            current = current.next;
            if (current != null) sBuilder.append(", ");
        }
        sBuilder.append("]");
        System.out.println(sBuilder.toString());
    }
}
