package command.queue;

import command.queue.command.GarageDoorOpenCommand;
import command.queue.command.LightOnCommand;
import command.queue.invoker.SimpleRemoteController;
import command.queue.receiver.GarageDoor;
import command.queue.receiver.LEDLight;

/**
 * Created by ville on 2018/2/6.
 */
public class TestCommand {
    public static void main(String[] args) {
        LightOnCommand lightOnCmd = new LightOnCommand();
        LEDLight light = new LEDLight();
        lightOnCmd.setLight(light);

        GarageDoorOpenCommand doorOpenCmd = new GarageDoorOpenCommand();
        GarageDoor garageDoor = new GarageDoor();
        doorOpenCmd.setDoor(garageDoor);

        SimpleRemoteController remote = new SimpleRemoteController();

        remote.setCommand(lightOnCmd);
        remote.buttonWasPressed();

        remote.setCommand(doorOpenCmd);
        remote.buttonWasPressed();
    }
}
