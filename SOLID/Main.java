package solid;

// SRP: Separate responsibilities
//class Bird {
//    void eat(){}
//}

class BirdDatabase implements BirdRepository {
    @Override
    public void save(Bird bird){}
}

// OCP and LSP: Using inheritance to ensure substitutability
abstract class Bird {
    abstract void move();
}

class Sparrow extends Bird implements Eater, Flyer {
    @Override
    public void move() {
        fly();
    }

    @Override
    public void eat() {}

    @Override
    public void fly() {}
}

class Penguin extends Bird implements Eater {
    @Override
    public void move() {
        walk();
    }

    @Override
    public void eat() {}

    private void walk() {}
}

// ISP: Segregating interfaces
interface Eater {
    void eat();
}

interface Flyer {
    void fly();
}

// DIP: Depend on abstractions
interface BirdRepository {
    void save(Bird bird);
}

class BirdService {
    private final BirdRepository repository;

    public BirdService(BirdRepository repository) {
        this.repository = repository;
    }

    public void saveBird(Bird bird) {
        repository.save(bird);
    }
}

public class Main {
    public static void main(String[] args) {
        BirdRepository birdRepository = new BirdDatabase();
        BirdService birdService = new BirdService(birdRepository);

        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        birdService.saveBird(sparrow);
        birdService.saveBird(penguin);
    }
}
