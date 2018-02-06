package command.receiver;

/**
 * Created by ville on 2018/2/6.
 */
public class LedReceiver implements Receiver {

    @Override
    public void on() {
        System.out.println("LED light on !");
    }
}
