package observer;

import java.util.ArrayList;
import java.util.List;

public class Mesho {

    private List<OrderPlacedSubscriber> observers;

    public Mesho() {
        observers = new ArrayList<>();
    }

    public void register(OrderPlacedSubscriber observer) {
        observers.add(observer);
    }

    public void unregister(OrderPlacedSubscriber observer) {
        observers.remove(observer);
    }

    public void orderPlaced() {
        for (OrderPlacedSubscriber observer : observers) {
            observer.anOrderPlaced();
        }
    }
}
