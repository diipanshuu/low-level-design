package prototype_design_pattern;

import java.util.HashMap;

public class Registry{
    HashMap<String, Classmate> registryMap;

    public Registry(){
        registryMap = new HashMap<>();
    }
}
