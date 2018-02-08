package command.macro.command;

import command.macro.receiver.Light;

public class LivingroomLightOnCommand implements Command {
    private Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
