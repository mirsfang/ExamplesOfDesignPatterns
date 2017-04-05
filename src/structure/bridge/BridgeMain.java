package structure.bridge;/**
 * Created by MirsFang on 2017/4/5.
 */

import structure.bridge.abs.Implementor;

/***
 *作者：MirsFang    
 *模式：桥接模式
 *时间：2017/04/05/下午12:29  
 *备注  执行类
 ***/

public class BridgeMain {


    public static void main(String[] args) {
        //实现化角色
        Implementor implementor=new ConcreteImplementor();
        //抽象化角色
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(implementor);
        //抽象化角色搞事情
        refinedAbstraction.doSomethings();
    }
}
