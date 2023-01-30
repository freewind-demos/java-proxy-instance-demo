package demo;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IHello {
    void hello(String name);
}

public class Hello implements IHello {

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        IHello helloProxy = (IHello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), Hello.class.getInterfaces(), (Object proxy, Method method, Object[] methodArgs) -> {
            System.out.println("---------before-------");
            Object result = method.invoke(hello, methodArgs);
            System.out.println("---------after-------");
            return result;
        });
        helloProxy.hello("Freewind");
    }

}
