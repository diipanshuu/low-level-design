package solid.liskov_substitution_principle;

/* Base Implementation */
public class Bird {
    void fly(){}
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

/* Adhering to LSP */
abstract class Bird {
    abstract void move();
}

class FlyingBird extends Bird {
    @Override
    void move() {
        fly();
    }

    private void fly(){}
}

class Ostrich extends Bird {
    @Override
    void move() {
        walk();
    }

    private void walk(){}
}