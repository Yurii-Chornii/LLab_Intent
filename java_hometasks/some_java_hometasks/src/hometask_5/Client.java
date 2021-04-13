package hometask_5;

public class Client implements Runnable{
    private final Shop SHOP;

    public Client(Shop shop) {
        this.SHOP = shop;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (SHOP) {
                if (SHOP.getItems() == 10) {
                    SHOP.setItems(0);
                    System.out.println("Client bought all items, count of items = " + SHOP.getItems());
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
