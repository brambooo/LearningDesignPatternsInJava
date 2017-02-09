/**
 * Created by Bram on 9-2-2017.
 * This Singleton class is uses a lazy initialization process.
 */
public class Singleton {
    // Hold only one instance of the Singleton
    private static Singleton instance = null;

    // Private constructor prevents any other class from instantiating
    private Singleton() {}

    // Providing the global point of access
    public static Singleton getInstance() {
        if(instance == null) {
            System.out.println("New Singleton instance created.");
            instance = new Singleton();
        }
        return instance;
    }

    public void getDatabaseAccess() {
        System.out.println("Inside singleton - database information given...");
    }
}
