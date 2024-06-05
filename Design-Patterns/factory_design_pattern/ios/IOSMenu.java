package factory_design_pattern.ios;

import factory_design_pattern.components_Interfaces.Menu;

public class IOSMenu implements Menu {

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
