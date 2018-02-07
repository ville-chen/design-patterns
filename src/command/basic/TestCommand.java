package command.basic;

import command.basic.command.GarageDoorOpenCommand;
import command.basic.command.LightOnCommand;
import command.basic.invoker.SimpleRemoteController;
import command.basic.receiver.GarageDoor;
import command.basic.receiver.LEDLight;

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
