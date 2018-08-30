package lwh.design.pattern.factory.abstrfac;

import lwh.design.pattern.factory.Noodle;
import lwh.design.pattern.factory.PaoNoodle;

public class KFCFoodFactory extends AbstractFoodFactory{
    @Override
    public Noodle createNoodle() {
        return new PaoNoodle();
    }

    @Override
    public Drink createDrink() {
        return new ColaDrink();
    }
}
