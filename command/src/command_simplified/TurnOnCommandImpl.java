package command_simplified;

/**
 * Created by Bram on 14-3-2017.
 * TurnOnCommandImpl
 * Command that implements the 'Command' contract
 */
public class TurnOnCommandImpl implements ICommand {
    private LampReceiver lamp;

    /**
     * TurnOnCommandImpl constructor
     * @param lamp Receiver
     */
    public TurnOnCommandImpl(LampReceiver lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOn();
    }

    @Override
    public void undo() {
        this.lamp.turnOff();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
