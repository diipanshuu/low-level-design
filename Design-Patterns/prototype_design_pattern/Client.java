package prototype_design_pattern;

public class Client {
    public static void main(String[] args) {

        Registry registry = new Registry();
        populateRegistry(registry);

        Classmate classmateFromPrototype1 = registry.registryMap.get("Prototype1").clone();
        classmateFromPrototype1.setName("Rahul");
        classmateFromPrototype1.setAge(20);
        print(classmateFromPrototype1);

        Classmate classmateFromPrototypeAgain = registry.registryMap.get("Prototype1").clone();
        print(classmateFromPrototypeAgain);

        Classmate extendedClassmateFromPrototype1 = registry.registryMap.get("Prototype2").clone();
        print(extendedClassmateFromPrototype1);

    }

    private static void print(Classmate classmateFromPrototypeAgain) {
        System.out.println("name " + classmateFromPrototypeAgain.getName());
        System.out.println("age " + classmateFromPrototypeAgain.getAge());
        System.out.println("street " + classmateFromPrototypeAgain.getAddress().getStreet());
        System.out.println("city " + classmateFromPrototypeAgain.getAddress().getCity());
        System.out.println("state " + classmateFromPrototypeAgain.getAddress().getState());
    }

    public static void populateRegistry(Registry registry){
        Classmate classmateProtoType1 = new Classmate();
        classmateProtoType1.setName("");
        classmateProtoType1.setAge(0);
        classmateProtoType1.setAddress(new Address("Street", "City", "State"));

        ExtendedClassmate extendedClassmateProtoType1 = new ExtendedClassmate();
        extendedClassmateProtoType1.setAge(21);
        extendedClassmateProtoType1.setName("ExtendedRahul");
        extendedClassmateProtoType1.setId(1);
        extendedClassmateProtoType1.setAddress(new Address("ExtendedStreet", "ExtendedCity", "ExtendedState"));

        // Registry to store prototypes
        registry.registryMap.put("Prototype1", classmateProtoType1);
        registry.registryMap.put("Prototype2", extendedClassmateProtoType1);
    }
}
