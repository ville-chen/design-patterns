package command.undo;

import command.undo.command.LightOffCommand;
import command.undo.command.LightOnCommand;
import command.undo.invoker.RemoteControlWithUndo;
import command.undo.receiver.LEDLight;

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

        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        remote.setCommands(0, lightOnCmd, lightOffCmd);

        remote.undoButtonWasPressed();

        remote.onButtonWasPressed(0);
        remote.undoButtonWasPressed();

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undoButtonWasPressed();

    }
}
