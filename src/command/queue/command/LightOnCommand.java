package command.queue.command;

import command.queue.receiver.LEDLight;

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
}
