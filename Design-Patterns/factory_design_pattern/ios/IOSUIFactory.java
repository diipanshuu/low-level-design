package factory_design_pattern.ios;

import factory_design_pattern.components_Interfaces.Button;
import factory_design_pattern.components_Interfaces.DropDown;
import factory_design_pattern.components_Interfaces.Menu;
import factory_design_pattern.UIFactory;

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
