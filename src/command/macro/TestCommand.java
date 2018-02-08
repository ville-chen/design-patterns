package command.macro;

import command.macro.command.Command;
import command.macro.command.HottubOffCommand;
import command.macro.command.HottubOnCommand;
import command.macro.command.LightOffCommand;
import command.macro.command.LightOnCommand;
import command.macro.command.MacroCommand;
import command.macro.command.StereoOffCommand;
import command.macro.command.StereoOnCommand;
import command.macro.command.TVOffCommand;
import command.macro.command.TVOnCommand;
import command.macro.invoker.RemoteControl;
import command.macro.receiver.Hottub;
import command.macro.receiver.Light;
import command.macro.receiver.Stereo;
import command.macro.receiver.TV;

public class TestCommand {

	public static void main(String[] args) {

		RemoteControl remote = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOff, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOn, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remote.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remote);
		System.out.println("--- Pushing Macro On---");
		remote.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remote.offButtonWasPushed(0);
        System.out.println("--- Pushing undo ---");
		remote.undoButtonWasPushed();
	}
}
