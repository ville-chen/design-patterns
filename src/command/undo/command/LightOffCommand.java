package command.undo.command;

import command.undo.receiver.LEDLight;

/**
 * Created by ville on 2018/2/7.
 * 关灯命令类
 */
public class LightOffCommand implements Command {

    private LEDLight light;

    public void setLight(LEDLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
