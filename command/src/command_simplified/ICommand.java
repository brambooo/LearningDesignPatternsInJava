package command_simplified;

/**
 * Created by Bram on 14-3-2017.
 * ICommand
 * 'Contract' that contains all the possible 'commands'. Every 'Command' need to implement this contract.
 */
public interface ICommand {
    void execute();
    void undo();
    void redo();
}
