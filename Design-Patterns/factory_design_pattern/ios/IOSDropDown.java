package factory_design_pattern.ios;

import factory_design_pattern.components_Interfaces.DropDown;

public class IOSDropDown implements DropDown {

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
