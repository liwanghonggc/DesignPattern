package lwh.design.pattern.singleton;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class StaticSingleton {

    private StaticSingleton(){

    }

    static class StaticClass {
        private static final StaticSingleton singleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return StaticClass.singleton;
    }
}
