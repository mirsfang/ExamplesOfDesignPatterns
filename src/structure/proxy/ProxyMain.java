package structure.proxy;

import structure.proxy.dynamicProxy.RealSujectImpl;
import structure.proxy.dynamicProxy.Subject;
import structure.proxy.dynamicProxy.SubjectInvocationHandler;
import structure.proxy.staticProxy.Proxy;
import structure.proxy.staticProxy.RealSuject;

/***
 *作者：MirsFang
 *模式：代理模式
 *时间：2017/2/28/
 *备注  代理模式运行类
 ***/
public class ProxyMain {

    public static void main(String[] args) {

//        staticProxy();

        dynamicProxy();
    }


    /*
    * 静态代理
    * */
    private static void staticProxy() {

        RealSuject realSuject = new RealSuject();

        Proxy proxy = new Proxy(realSuject);
        proxy.request();

    }


    /**
    *
    *作者:Mirsfang
    *日期:2017/2/28/下午12:54
    *描述:动态代理
    **/
    private static void dynamicProxy(){
        RealSujectImpl realSubject=new RealSujectImpl();
        SubjectInvocationHandler handler=new SubjectInvocationHandler(realSubject);
        Subject subject= (Subject) handler.getProxy();
        subject.request();
    }


}