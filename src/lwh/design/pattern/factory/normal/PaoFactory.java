package lwh.design.pattern.factory.normal;

import lwh.design.pattern.factory.Noodle;
import lwh.design.pattern.factory.PaoNoodle;

/**
 * 泡面工厂类
 */
public class PaoFactory extends NoodleFactory {
    @Override
    public Noodle createNoodle() {
        return new PaoNoodle();
    }
}
