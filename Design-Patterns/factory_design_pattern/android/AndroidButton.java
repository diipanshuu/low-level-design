package factory_design_pattern.android;

import factory_design_pattern.components_Interfaces.Button;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Android Button");
    }
}
