package singleton_design_pattern;

public class Client {

    public static void main(String[] args) {

        // **Commented out:** Creating instances directly won't work because the constructor is private
        /*
        SingletonDesignPattern singletonDesignPattern = new SingletonDesignPattern();
        singletonDesignPattern.setAttribute(1);
        System.out.println(singletonDesignPattern.getAttribute());

        SingletonDesignPattern singletonDesignPattern2 = new SingletonDesignPattern();
        singletonDesignPattern2.setAttribute(2);
        System.out.println(singletonDesignPattern2.getAttribute());
        */

        // **Commented out:** Sequential access demonstrates that the same instance is returned
        /*
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        SingletonDesignPattern singletonDesignPattern2 = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern == singletonDesignPattern2); // Prints true - same instance
        System.out.println(singletonDesignPattern);
        System.out.println(singletonDesignPattern2);
        */

        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
                    System.out.println("Thread " + Thread.currentThread().getName() + " accessed instance: " + instance);
                }
            });

            threads[i].start();
        }
    }
}

