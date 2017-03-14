package command_simplified;


/**
 * Created by Bram on 14-3-2017.
 * TurnOffCommandImpl
 * Command that implements the 'Command' contract
 */
public class TurnOffCommandImpl implements ICommand {
    private LampReceiver lamp;

    /**
     * TurnOnCommandImpl constructor
     * @param lamp Receiver
     */
    public TurnOffCommandImpl(LampReceiver lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOff();
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
