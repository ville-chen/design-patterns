package command.queue.command;

import command.queue.receiver.LEDLight;

/**
 * Created by admin on 2018/2/7.
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
}
