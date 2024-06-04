package prototype_design_pattern;

public class ExtendedClassmate extends Classmate {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ExtendedClassmate() {}
    public ExtendedClassmate(ExtendedClassmate cl) {
        super(cl);
        this.id = cl.id;
    }

    @Override
    public ExtendedClassmate clone(){
        return new ExtendedClassmate(this);
    }

}
