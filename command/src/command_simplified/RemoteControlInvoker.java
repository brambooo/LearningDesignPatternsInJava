package command_simplified;

/**
 * Created by Bram on 14-3-2017.
 * RemoteControlInvoker client will interact with it to process command(s).
 */
public class RemoteControlInvoker {
    public void submit(ICommand c) {
        c.execute();
    }
}
