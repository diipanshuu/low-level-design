package factory_design_pattern;

import factory_design_pattern.components_Interfaces.Button;
import factory_design_pattern.components_Interfaces.DropDown;
import factory_design_pattern.components_Interfaces.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);

        UIFactory uiFactory = flutter.createFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}
