package hometask_5;

public class Shop {
    private int items;

    public static void main(String[] args) {

        Shop shop = new Shop();

        Thread client = new Thread(new Client(shop));
        Thread factory = new Thread(new Factory(shop));

        factory.setDaemon(true);
        client.setDaemon(true);

        factory.start();
        client.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getItems() {
        return items;
    }

}
