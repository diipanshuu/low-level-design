package singleton_design_pattern;

public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;
    private static Object lock = new Object();
    private int attribute;

    public int getAttribute(){
        return attribute;
    }

    public void setAttribute(int attribute){
        this.attribute = attribute;
    }

    private SingletonDesignPattern(){
        // Not able to create an instance of it
    }

    /*
    Lazy initialization
    public static SingletonDesignPattern getInstance(){
        return instance==null ? instance = new SingletonDesignPattern()
                :instance;
    }
    */

    /*
    Eager initialization
    public static SingletonDesignPattern getInstance(){
        return instance;
    }
    */

    /*
    Multithreaded system Singleton Design Pattern with Full Synchronization
    public static synchronized SingletonDesignPattern getInstance(){
        if(instance == null){
            instance = new SingletonDesignPattern();
        }
        return instance;
    }
    */

    /*
    Double-Checked Locking to handle concurrent threads
     */
    public static SingletonDesignPattern getInstance(){
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new SingletonDesignPattern();
                }
            }
        }
        return instance;
    }
}
