package command.queue.invoker;

import command.queue.command.Command;

/**
 * Created by ville on 2018/2/6.
 * 调用者
 */
public class SimpleRemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
