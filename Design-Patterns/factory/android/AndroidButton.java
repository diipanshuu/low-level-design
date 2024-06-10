package factory.android;

import factory.components_Interfaces.Button;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Android Button");
    }
}
