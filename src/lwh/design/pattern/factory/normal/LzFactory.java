package lwh.design.pattern.factory.normal;

import lwh.design.pattern.factory.LzNoodle;
import lwh.design.pattern.factory.Noodle;

/**
 * 兰州拉面工厂
 */
public class LzFactory extends NoodleFactory{
    @Override
    public Noodle createNoodle() {
        return new LzNoodle();
    }
}
