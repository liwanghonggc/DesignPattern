package lwh.design.pattern.ProducerConsumer;

/**
 * @author lwh
 * @date 2019-03-11
 * @desp
 */
public class Product {

    String name;

    double price;

    /**
     * 产品是否生产完毕的标识,默认情况是没有生产完成
     */
    boolean flag = false;
}
