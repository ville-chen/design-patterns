package decorator.demo;

/**
 * A公司工人类:
 */
public class AWorker implements Worker{

    private Worker worker;

    public AWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doWork() {
        System.out.print("A公司的");
        worker.doWork();
    }
}
