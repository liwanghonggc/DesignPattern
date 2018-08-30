package lwh.design.pattern.factory.normal;

import lwh.design.pattern.factory.GKNoodle;
import lwh.design.pattern.factory.Noodle;

/**
 * 干扣面工厂类
 */
public class GKFactory extends NoodleFactory{
    @Override
    public Noodle createNoodle() {
        return new GKNoodle();
    }
}
