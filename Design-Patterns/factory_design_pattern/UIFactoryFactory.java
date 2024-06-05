package factory_design_pattern;

import factory_design_pattern.android.AndroidUIFactory;
import factory_design_pattern.ios.IOSUIFactory;

import static factory_design_pattern.SupportedPlatforms.ANDROID;
import static factory_design_pattern.SupportedPlatforms.IOS;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
        if(supportedPlatforms == IOS){
            return new IOSUIFactory();
        } else if (supportedPlatforms == ANDROID){
            return new AndroidUIFactory();
        }
        return null;
    }
}
