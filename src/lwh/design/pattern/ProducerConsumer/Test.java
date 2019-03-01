package lwh.design.pattern.ProducerConsumer;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class Test {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Thread p1 = new Producer(queue, "Producer-1");
        Thread p2 = new Producer(queue, "Producer-2");
        Thread p3 = new Producer(queue, "Producer-3");

        Thread c1 = new Consumer(queue, "Consumer-1");
        Thread c2 = new Consumer(queue, "Consumer-2");

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();

    }
}
