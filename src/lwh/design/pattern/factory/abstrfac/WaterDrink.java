package lwh.design.pattern.factory.abstrfac;

public class WaterDrink implements Drink{
    @Override
    public void price() {
        System.out.println("白开水,不要钱");
    }
}
