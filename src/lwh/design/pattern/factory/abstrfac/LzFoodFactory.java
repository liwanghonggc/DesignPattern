package lwh.design.pattern.factory.abstrfac;

import lwh.design.pattern.factory.LzNoodle;
import lwh.design.pattern.factory.Noodle;

/**
 * 兰州大酒店
 */
public class LzFoodFactory extends AbstractFoodFactory{
    @Override
    public Noodle createNoodle() {
        return new LzNoodle();
    }

    @Override
    public Drink createDrink() {
        return new WaterDrink();
    }
}
