package solid.open_closed_principle;

/* Base Implementation */
public class Bird {
    void fly() {}
}

/* Adhering to OCP */
abstract class Bird {
    abstract void move();
}

class FlyingBird extends Bird {
    @Override
    void move() {
        fly();
    }

    private void fly() {}
}

class WalkingBird extends Bird {
    @Override
    void move() {
        walk();
    }

    private void walk() {}
}
