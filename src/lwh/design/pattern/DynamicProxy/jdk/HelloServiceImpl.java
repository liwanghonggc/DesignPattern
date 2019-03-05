package lwh.design.pattern.DynamicProxy.jdk;

/**
 * @author lwh
 * @date 2019-03-05
 * @desp
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public void sayHello(String str) {
        System.out.println("你好: " + str);
    }
}
