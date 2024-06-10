package factory;

import factory.components_Interfaces.Button;
import factory.components_Interfaces.DropDown;
import factory.components_Interfaces.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
