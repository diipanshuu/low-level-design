package observer;

public class InventorySubscriber implements OrderPlacedSubscriber{

    @Override
    public boolean anOrderPlaced() {
        // Logic to update inventory
        return true;
    }
}
