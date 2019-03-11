package lwh.design.pattern.ProducerConsumer;

/**
 * @author lwh
 * @date 2019-03-11
 * @desp
 */
public class Consumer extends Thread{

    Product p;

    public Consumer(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            synchronized (p){
                if(p.flag){
                    System.out.println("消费者已经消费了: " + p.name + " 价格: " + p.price);
                    p.flag = false;
                    p.notify();
                }else{
                    //产品还没生产,等待一会
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
