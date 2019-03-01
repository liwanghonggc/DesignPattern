package lwh.design.pattern.ProducerConsumer;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class Consumer extends Thread{

    private LinkedBlockingQueue<Integer> queue;
    private String name;
    private int i = 1;

    public Consumer(LinkedBlockingQueue<Integer> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            try {
                int x = queue.take();
                System.out.println(name + " Consume " + x);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
