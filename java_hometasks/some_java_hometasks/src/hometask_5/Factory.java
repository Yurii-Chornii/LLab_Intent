package hometask_5;

public class Factory implements Runnable {
    private final Shop SHOP;

    public Factory(Shop shop) {
        this.SHOP = shop;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (SHOP) {
                if (SHOP.getItems() < 10) {
                    SHOP.setItems(SHOP.getItems()+10);
                    System.out.println("Factory is adding items - " + SHOP.getItems());
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
