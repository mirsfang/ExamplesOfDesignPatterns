package structure.bridge;/**
 * Created by MirsFang on 2017/4/5.
 */

import structure.bridge.abs.Implementor;

/***
 *作者：MirsFang    
 *模式：桥接模式
 *时间：2017/04/05/下午12:24  
 *备注  具体实现类
 ***/

public class ConcreteImplementor implements Implementor {
    @Override
    public void doSomethingA() {
        System.out.println("bridge do something A");
    }

    @Override
    public void doSomethingB() {
        System.out.println("bridge do something B");
    }
}
