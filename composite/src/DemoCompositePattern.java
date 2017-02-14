/**
 * Created by Bram on 14-2-2017.
 */
public class DemoCompositePattern {
    public static void main(String[] args) {
        Employee emp1 = new Developer("Bram", 10000);
        Employee emp2 = new Developer("Kees", 15000);
        Employee manager1 = new Manager("Bert", 25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3 = new Developer("Erik", 20000);
        Manager generalManager = new Manager("Mark", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
