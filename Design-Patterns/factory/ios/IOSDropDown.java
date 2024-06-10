package factory.ios;

import factory.components_Interfaces.DropDown;

public class IOSDropDown implements DropDown {

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
