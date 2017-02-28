package structure.proxy.dynamicProxy;/**
 * Created by MirsFang on 2017/2/28.
 */

import com.sun.org.apache.regexp.internal.RE;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 *作者：MirsFang    
 *模式：代理模式
 *时间：2017/02/28/下午12:41  
 *备注 利用java.lang.reflect.Proxy类和java.lang.reflect.InvocationHandler接口定义代理类的实现
 ***/

public class SubjectInvocationHandler implements InvocationHandler {

    private Object target;

    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----before----");
        //调用方法
        Object result = method.invoke(target, args);
        System.out.println("----end----");
        return result;
    }

    public Object getProxy() {
        //获取当前线程的classloder
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //获取所有的interface
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
