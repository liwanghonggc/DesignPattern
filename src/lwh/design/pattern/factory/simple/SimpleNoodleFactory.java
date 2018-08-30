package lwh.design.pattern.factory.simple;

/**
 * 面条简单工厂类
 */
public class SimpleNoodleFactory {

    /** 兰州拉面 **/
    public static final int TYPE_LZ = 1;

    /** 泡面 **/
    public static final int TYPE_PAO = 2;

    /** 干扣面 **/
    public static final int TYPE_GK = 3;

    /** 它是一个具体的类,非接口抽象类,有一个create方法,它通常是静态的,因此也称静态工厂模式 **/
    /**
        缺点
        1.扩展性差,想新增一种面条,除了新增一个面条产品类,还要修改工厂类方法
        2.不同的产品需要不同额外的参数的时候不支持
     */
    public static Noodle createNoodle(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodle();

            case TYPE_PAO:
                return new PaoNoodle();

            case TYPE_GK:
            default:
                return new GKNoodle();
        }
    }
}
