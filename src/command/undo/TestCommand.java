package command.undo;

import command.undo.command.CeilingFanHighCommand;
import command.undo.command.CeilingFanLowCommand;
import command.undo.command.CeilingFanMediumCommand;
import command.undo.command.CeilingFanOffCommand;
import command.undo.command.LightOffCommand;
import command.undo.command.LightOnCommand;
import command.undo.invoker.RemoteControlWithUndo;
import command.undo.receiver.CeilingFan;
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

        System.out.println("--------------------------------------");

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCmd = new CeilingFanHighCommand();
        CeilingFanMediumCommand ceilingFanMediumCmd = new CeilingFanMediumCommand();
        CeilingFanLowCommand ceilingFanLowCmd = new CeilingFanLowCommand();
        CeilingFanOffCommand ceilingFanOffCmd = new CeilingFanOffCommand();

        ceilingFanHighCmd.setCeilingFan(ceilingFan);
        ceilingFanMediumCmd.setCeilingFan(ceilingFan);
        ceilingFanLowCmd.setCeilingFan(ceilingFan);
        ceilingFanOffCmd.setCeilingFan(ceilingFan);

        remoteControl.setCommands(0, ceilingFanMediumCmd, ceilingFanOffCmd);
        remoteControl.setCommands(1, ceilingFanHighCmd, ceilingFanOffCmd);
        remoteControl.setCommands(2, ceilingFanLowCmd, ceilingFanOffCmd);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

    }
}
