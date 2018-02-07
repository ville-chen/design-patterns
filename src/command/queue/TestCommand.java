package command.queue;

import command.queue.command.GarageDoorCloseCommand;
import command.queue.command.GarageDoorOpenCommand;
import command.queue.command.LightOffCommand;
import command.queue.command.LightOnCommand;
import command.queue.invoker.QueueRemoteController;
import command.queue.receiver.GarageDoor;
import command.queue.receiver.LEDLight;

/**
 * Created by ville on 2018/2/6.
 */
public class TestCommand {
    public static void main(String[] args) {
        LightOnCommand lightOnCmd = new LightOnCommand();
        LightOffCommand lightOffCmd = new LightOffCommand();
        LEDLight light = new LEDLight();
        lightOnCmd.setLight(light);
        lightOffCmd.setLight(light);

        GarageDoorOpenCommand doorOpenCmd = new GarageDoorOpenCommand();
        GarageDoorCloseCommand doorCloseCmd = new GarageDoorCloseCommand();
        GarageDoor garageDoor = new GarageDoor();
        doorOpenCmd.setDoor(garageDoor);
        doorCloseCmd.setDoor(garageDoor);

        QueueRemoteController remote = new QueueRemoteController();

        remote.setCommands(0, lightOnCmd, lightOffCmd);
        remote.setCommands(1, doorOpenCmd, doorCloseCmd);

        for (int i = 0; i < 6; i++) {
            remote.onButtonWasPressed(i);
            remote.offButtonWasPressed(i);
        }

        System.out.println(remote.toString());

    }
}
