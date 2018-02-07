package command.queue.command;

import command.queue.receiver.GarageDoor;

/**
 * Created by ville on 2018/2/7.
 * 开车库门命令类
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;

    public void setDoor(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
