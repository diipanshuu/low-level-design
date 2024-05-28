package solid.interface_segregation_principle;

/* Base Implementation */
public interface Bird {
    void fly();
    void eat();
}

class Sparrow implements Bird{
    @Override
    public void fly() {}

    @Override
    public void eat() {}
}

class Penguin implements Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }

    @Override
    public void eat() {}
}

/* Adhering to ISP */
interface Eater {
    void eat();
}

interface Flyer {
    void fly();
}

class Sparrow implements Eater, Flyer {
    @Override
    public void eat() {}

    @Override
    public void fly() {}
}

class Penguin implements Eater{
    @Override
    public void eat() {}
}
