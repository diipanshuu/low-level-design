package observer;

public class NotificationSubscriber implements OrderPlacedSubscriber{

    @Override
    public boolean anOrderPlaced() {
        // Logic to send Notification
        return true;
    }
}
