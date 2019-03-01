package lwh.design.pattern.singleton;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp
 */
public class LazySingleton {

    private LazySingleton(){

    }

    //禁止指令重排序
    private static volatile LazySingleton singleton = null;

    public static LazySingleton getInstance(){
        if(singleton == null){
            synchronized (LazySingleton.class){
                if(singleton == null){
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }
}
