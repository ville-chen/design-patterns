package command.queue.invoker;

import command.queue.command.Command;
import command.queue.command.NoCommand;

/**
 * Created by ville on 2018/2/6.
 * 调用者
 */
public class QueueRemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    public QueueRemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
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
}
