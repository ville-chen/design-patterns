package command;

import command.command.LightOnCommand;
import command.invoker.SimpleRemoteController;
import command.receiver.LedReceiver;
import command.receiver.Receiver;

/**
 * Created by ville on 2018/2/6.
 */
public class TestCommand {
    public static void main(String[] args) {
        LightOnCommand lightOnCommand = new LightOnCommand();

        Receiver led = new LedReceiver();
        lightOnCommand.setLight(led);

        SimpleRemoteController remoteController = new SimpleRemoteController();
        remoteController.setSlot(lightOnCommand);

        remoteController.buttonWasPressed();
    }
}
