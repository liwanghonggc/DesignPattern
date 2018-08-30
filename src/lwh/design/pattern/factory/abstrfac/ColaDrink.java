package lwh.design.pattern.factory.abstrfac;

public class ColaDrink implements Drink{
    @Override
    public void price() {
        System.out.println("可乐三块五");
    }
}
