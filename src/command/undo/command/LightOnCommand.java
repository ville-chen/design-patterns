package command.undo.command;

import command.undo.receiver.LEDLight;

/**
 * Created by ville on 2018/2/6.
 * 开灯命令类
 */
public class LightOnCommand implements Command {

    private LEDLight light;

    public void setLight(LEDLight light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
