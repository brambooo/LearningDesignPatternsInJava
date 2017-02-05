/**
 * Created by Bram on 5-2-2017.
 */
public class ConcreteComputerABuilder extends ComputerBuilder {


    @Override
    public void buildHdd(String hdd) {
        computer.setHdd(hdd);
    }

    @Override
    public void buildRam(String ram) {
        computer.setRam(ram);
    }

    @Override
    public void buildIsGraphicCardEnabled(boolean isEnabled) {
        computer.setGraphicCardEnabled(isEnabled);
    }

    @Override
    public void buildIsBluetoothCardEnabled(boolean isEnabled) {
        computer.setBluetoothEnabled(isEnabled);
    }
}
