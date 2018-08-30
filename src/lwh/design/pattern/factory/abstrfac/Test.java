package lwh.design.pattern.factory.abstrfac;

public class Test {

    public static void main(String[] args) {
        AbstractFoodFactory kfcFoodFactory = new KFCFoodFactory();
        kfcFoodFactory.createDrink().price();
        kfcFoodFactory.createNoodle().desc();

        AbstractFoodFactory lzFoodFactory = new LzFoodFactory();
        lzFoodFactory.createDrink().price();
        lzFoodFactory.createNoodle().desc();
    }
}
