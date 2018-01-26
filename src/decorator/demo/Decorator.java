package decorator.demo;

/**
 * 工人、水管工、木匠、A公司水管工、B公司的水管工、A公司的木匠、B公司的木匠
 * 装饰者给被装饰者增加了功能
 */
public class Decorator {
    public static void main(String[] args) {
        Worker w1 = new Carpenter();
        AWorker acarp = new AWorker(w1);
        acarp.doWork();

        Worker w2 = new Plumber();
        AWorker aplum = new AWorker(w2);
        aplum.doWork();

        Worker w3 = new Carpenter();
        BWorker bcarp = new BWorker(w3);
        bcarp.doWork();

        Worker w4 = new Plumber();
        BWorker bplum = new BWorker(w4);
        bplum.doWork();
    }
}
