package factory.ios;

import factory.components_Interfaces.Button;

public class IOSButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("IOS Button");
    }
}
