package lwh.design.pattern.ProducerConsumer;

/**
 * @author lwh
 * @date 2019-03-11
 * @desp
 */
public class Test {

    public static void main(String[] args) {
        Product product = new Product();

        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);

        producer.start();
        consumer.start();
    }
}
