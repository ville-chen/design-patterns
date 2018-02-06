package command.command;

import command.receiver.Receiver;

/**
 * Created by ville on 2018/2/6.
 * 命令对象
 */
public class LightOnCommand implements Command {

    private Receiver light;

    public void setLight(Receiver light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
