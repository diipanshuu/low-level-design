package factory.ios;

import factory.components_Interfaces.Button;
import factory.components_Interfaces.DropDown;
import factory.components_Interfaces.Menu;
import factory.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
