package lwh.design.pattern.DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lwh
 * @date 2019-03-05
 * @desp
 */
public class HelloServiceProxy implements InvocationHandler {

    /**
     * 传入的真实的要代理的对象
     */
    private Object target;

    public HelloServiceProxy(Object target) {
        this.target = target;
    }

    /**
     * @param proxy   代理对象
     * @param method  代理对象要增强的方法
     * @param args    方法参数
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("before invoke");
        Object invoke = method.invoke(target, args);
        System.out.println("after invoke");
        return invoke;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
