package action.observer;/**
 * Created by MirsFang on 2017/3/3.
 */

import action.observer.observerAbs.Observer;
import action.observer.observerAbs.Subject;
import action.observer.observerIml.DiaoSi;
import action.observer.observerIml.NvShen;

import java.util.ArrayList;

/***
 *作者：MirsFang    
 *模式：观察者模式
 *时间：2017/03/03/下午1:10  
 *备注  观察者模式运行类
 ***/

public class ObserverMain {

    public static void main(String[] args) {
        //实例化一个女神。(现实中也能这么New就好了  for(;;) new Nvshen();  哈哈)
        NvShen nvShen=new NvShen();
        //添加尾随大军
        getObservers(nvShen);
        //女神要出去逛街了!!!
        nvShen.goShopping();

    }


    //添加10个观察者(真变态)
    public static void getObservers(Subject nvShen){
        for (int i = 0; i < 10 ; i++) {
            DiaoSi diaosi=new DiaoSi("屌丝"+i);
            nvShen.Attach(diaosi);
        }
    }


}
