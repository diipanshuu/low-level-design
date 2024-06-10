package factory.ios;

import factory.components_Interfaces.Menu;

public class IOSMenu implements Menu {

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
