package command.macro.command;

import command.macro.receiver.TV;

public class TVOnCommand implements Command {
    private TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
