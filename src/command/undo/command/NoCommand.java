package command.undo.command;

/**
 * Created by admin on 2018/2/7.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("no command bind!");
    }

    @Override
    public void undo() {
        System.out.println("no command has done!");
    }
}
