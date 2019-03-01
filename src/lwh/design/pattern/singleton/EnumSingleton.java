package lwh.design.pattern.singleton;

/**
 * @author lwh
 * @date 2019-03-01
 * @desp 枚举实现单例模式
 */
public class EnumSingleton {

    //构造函数私有化
    private EnumSingleton(){
    }

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM保证该方法只被调用一次
        Singleton(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}
