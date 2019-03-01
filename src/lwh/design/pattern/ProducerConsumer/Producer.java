package lwh.design.pattern.ProducerConsumer;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class Producer extends Thread{

    private LinkedBlockingQueue<Integer> queue;
    private String name;
    private volatile int i = 1;

    public Producer(LinkedBlockingQueue<Integer> queue, String name){
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.put(i);
                System.out.println(name + " Produce value: " + i);
                i++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
