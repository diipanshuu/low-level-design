package factory;

import factory.components_Interfaces.Button;
import factory.components_Interfaces.DropDown;
import factory.components_Interfaces.Menu;

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
