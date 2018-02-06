package command.invoker;

import command.command.Command;

/**
 * Created by ville on 2018/2/6.
 * 调用者
 */
public class SimpleRemoteController {
    private Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
