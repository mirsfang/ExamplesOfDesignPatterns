package action.observer.observerIml;/**
 * Created by MirsFang on 2017/3/3.
 */

import action.observer.observerAbs.Observer;

/***
 *作者：MirsFang    
 *模式：观察者模式
 *时间：2017/03/03/下午1:02  
 *备注  屌丝
 ***/

public class DiaoSi  implements Observer{
    //你的名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaoSi(String name) {
        this.name = name;
    }

    public DiaoSi() {
    }

    @Override
    public void Update() {
        System.out.println(name+"已经知道女神出门,准备跟(wei)踪(sui)");
    }


}
