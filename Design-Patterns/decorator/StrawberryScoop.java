package decorator;

public class StrawberryScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }


    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Strawberry Scoop";
    }
}
