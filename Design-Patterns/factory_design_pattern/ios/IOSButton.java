package factory_design_pattern.ios;

import factory_design_pattern.components_Interfaces.Button;

public class IOSButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("IOS Button");
    }
}
