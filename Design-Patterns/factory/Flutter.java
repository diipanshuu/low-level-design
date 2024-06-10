package factory;

public class Flutter{
    private final SupportedPlatforms supportedPlatforms;
    public Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms = supportedPlatforms;
    }

    public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
