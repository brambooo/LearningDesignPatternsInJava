/**
 * Created by Bram on 5-2-2017.
 */
public abstract class ComputerBuilder
{
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createComputer() {
        computer = new Computer();
    }

    public abstract void buildHdd(String hdd);
    public abstract void buildRam(String ram);
    public abstract void buildIsGraphicCardEnabled(boolean isEnabled);
    public abstract void buildIsBluetoothCardEnabled(boolean isEnabled);

}
