/**
 * Created by Bram on 5-2-2017.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        ComputerBuilder cb = new ConcreteComputerABuilder();
        cb.createComputer();
        cb.buildHdd("special A hdd");
        cb.buildRam("special A RAM");
        cb.buildIsGraphicCardEnabled(true);
        cb.buildIsBluetoothCardEnabled(false);

        System.out.println("First creation:");
        System.out.println(cb.getComputer());

        System.out.println("#####");

        System.out.println("Second creation:");
        cb.buildHdd("Hardcore hdd");
        cb.buildRam("Hardcore RAM");
        cb.buildIsGraphicCardEnabled(true);
        cb.buildIsBluetoothCardEnabled(true);
        System.out.println(cb.getComputer());
    }
}
