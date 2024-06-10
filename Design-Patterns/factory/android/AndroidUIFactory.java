package factory.android;

import factory.components_Interfaces.Button;
import factory.components_Interfaces.DropDown;
import factory.components_Interfaces.Menu;
import factory.UIFactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
