package command_simplified;

/**
 * Created by Bram on 14-3-2017.
 */
public class DemoClient {

    /**
     * steps:
     * 1) Client/Invoker create a new command and add a receiver to it.
     * 2) Invoker submit command
     * 3) Receiver receives summit call and execute real action
     * @param args
     */

    public static void main(String[] args) {
        // Create 'Receiver' - contains knowledge about all the possible actions
        LampReceiver receiver = new LampReceiver();


        // Commands with receiver
        TurnOnCommandImpl turnOnCommand = new TurnOnCommandImpl(receiver);
        TurnOffCommandImpl turnOffCommand = new TurnOffCommandImpl(receiver);


        // Invoker is called in the client to process commands
        RemoteControlInvoker invoker = new RemoteControlInvoker();
        invoker.submit(turnOnCommand);
        invoker.submit(turnOffCommand);


    }

}
