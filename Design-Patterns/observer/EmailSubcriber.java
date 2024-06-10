package observer;

public class EmailSubcriber implements OrderPlacedSubscriber{
    @Override
    public boolean anOrderPlaced() {
        // Logic to send Email
        return true;
    }
}
