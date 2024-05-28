package solid.single_responsibility_principle;

/* Base implementation */
public class Bird {
    void fly(){}

    void saveToDatabase(){}
}

/* Adhering to SRP */
class Bird {
    void fly(){}
}

class BirdDatabase {
    void saveToDatabase(){}
}
