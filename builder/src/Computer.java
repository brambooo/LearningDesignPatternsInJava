/**
 * Created by Bram on 5-2-2017.
 */
public class Computer
{
    // Required attributes
    private String hdd;
    private String ram;

    // Optional attributes
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer created with: hdd: " + hdd + ", ram: " + ram + ", isGraphicCardEnabled: " + isGraphicCardEnabled +  " isBluetoothEnabled: "  + isBluetoothEnabled + ".";
    }
}
