package lwh.design.pattern.DynamicProxy.jdk;

/**
 * @author lwh
 * @date 2019-03-05
 * @desp
 */
public class Test {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();

        HelloServiceProxy proxy = new HelloServiceProxy(helloService);

        helloService = (HelloService) proxy.getProxy();
        helloService.sayHello("李旺红");
    }
}
