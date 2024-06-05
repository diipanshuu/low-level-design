package factory_design_pattern.android;

import factory_design_pattern.components_Interfaces.Button;
import factory_design_pattern.components_Interfaces.DropDown;
import factory_design_pattern.components_Interfaces.Menu;
import factory_design_pattern.UIFactory;

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
