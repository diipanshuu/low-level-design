package solid.dependency_inversion_principle;

import solid.single_responsibility_principle.BirdDatabase;

/* Base Implementation */
public class BirdService {
    void saveBird(Bird bird) {
        BirdDatabase database = new BirdDatabase();
        database.saveToDatabase(bird);
    }
}

class BirdDatabase {
    void saveToDatabase(Bird bird) {}
}

/* Adhering to DIP */
interface BirdRepository {
    void save(Bird bird);
}

class BirdDatabase implements BirdRepository {
    @Override
    public void save(Bird bird) {}
}

class BirdService {
    private final BirdRepository repository;

    public BirdService(BirdRepository repository) {
        this.repository = repository;
    }

    void saveBird(Bird bird) {
        repository.save(bird);
    }
}