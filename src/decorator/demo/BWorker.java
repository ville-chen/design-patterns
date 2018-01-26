package decorator.demo;

/**
 * B公司工人类:
 */
public class BWorker implements Worker {

    private Worker worker;

    public BWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doWork() {
        System.out.print("B公司的");
        worker.doWork();
    }
}