package factory_design_pattern;

public class Flutter{
    private final SupportedPlatforms supportedPlatforms;
    public Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms = supportedPlatforms;
    }

    public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
