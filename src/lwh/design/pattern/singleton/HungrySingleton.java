package lwh.design.pattern.singleton;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class HungrySingleton {

    private HungrySingleton(){

    }

    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
