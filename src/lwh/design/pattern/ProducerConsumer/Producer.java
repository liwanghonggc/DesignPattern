package lwh.design.pattern.ProducerConsumer;

/**
 * @author lwh
 * @date 2019-03-11
 * @desp
 */
public class Producer extends Thread{

    Product p;

    Producer(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            synchronized (p){
                if(!p.flag){
                    p.name = "苹果";
                    p.price = 10;
                    System.out.println("生产者生产了: " + p.name + " 价格是: " + p.price);
                    p.flag = true;
                    p.notify();
                }else {
                    //已经生产,等待消费者先去消费
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
