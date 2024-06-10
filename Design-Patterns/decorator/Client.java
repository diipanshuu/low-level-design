package decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(
                        new VanilaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocolateCone(
                                                        new ChocolateCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(iceCreamConeConstituents.getCost());
        System.out.println(iceCreamConeConstituents.getDescription());
    }
}
