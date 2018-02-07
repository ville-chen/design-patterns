package command.undo.invoker;

import command.undo.command.Command;
import command.undo.command.NoCommand;

/**
 * Created by ville on 2018/2/6.
 * 调用者
 */
public class RemoteControlWithUndo {

    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName()).append(" & ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        return builder.toString();
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
