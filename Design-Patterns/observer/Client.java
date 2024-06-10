package observer;

public class Client {
    public static void main(String[] args) {
        Mesho mesho = new Mesho();
        mesho.register(new EmailSubcriber());
        mesho.register(new InventorySubscriber());
        mesho.register(new NotificationSubscriber());

        mesho.orderPlaced();
    }
}
