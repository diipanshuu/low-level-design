package factory;

import factory.android.AndroidUIFactory;
import factory.ios.IOSUIFactory;

import static factory.SupportedPlatforms.ANDROID;
import static factory.SupportedPlatforms.IOS;

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
