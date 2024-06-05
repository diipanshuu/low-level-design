package factory_design_pattern;

import factory_design_pattern.components_Interfaces.Button;
import factory_design_pattern.components_Interfaces.DropDown;
import factory_design_pattern.components_Interfaces.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
