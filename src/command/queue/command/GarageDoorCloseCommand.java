package command.queue.command;

import command.queue.receiver.GarageDoor;

/**
 * Created by admin on 2018/2/7.
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor door;

    public void setDoor(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }
}
