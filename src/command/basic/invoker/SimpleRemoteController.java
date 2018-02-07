package command.basic.invoker;

import command.basic.command.Command;

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
