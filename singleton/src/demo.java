/**
 * Created by Bram on 9-2-2017.
 */
public class demo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.toString());

        // Validate both declared variables has the same reference in memory
        if(singleton1.equals(singleton2)) {
            System.out.println("Same reference");
        } else {
            System.out.println("Not same reference");
        }

        // Possible to get use a method
        singleton1.getDatabaseAccess();
    }
}
