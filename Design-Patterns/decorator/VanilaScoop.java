package decorator;

public class VanilaScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public VanilaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + VanilaScoop";
    }
}
