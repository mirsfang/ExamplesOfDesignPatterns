package action.observer.observerIml;/**
 * Created by MirsFang on 2017/3/3.
 */


import action.observer.observerAbs.Observer;
import action.observer.observerAbs.Subject;

import java.util.ArrayList;
import java.util.List;

/***
 *作者：MirsFang    
 *模式：观察者模式
 *时间：2017/03/03/下午1:02  
 *备注  女神
 ***/

public class NvShen implements Subject{
    private List<Observer> observersList;

    //女神要去逛街了
    public void goShopping(){
        System.out.println("女神准备要去逛街了!!");
        //调用通知方法
        Notify();
    }

    @Override
    public void Attach(Observer observer) {
        if(observersList==null){
            observersList=new ArrayList<>();
        }else {
            observersList.add(observer);
        }
    }

    @Override
    public void Detach(Observer observer) {
        String name=((DiaoSi)observer).getName();
        if(observersList==null||observersList.size()==0){
            return;
        }
       if( observersList.remove(observer)){
           System.out.print(name+"已经被踢出队伍");
       }
    }

    @Override
    public void Notify() {
        for (Observer observer:
             observersList) {
            //通知所有的跟随人员
            observer.Update();
        }
        System.out.print("尾随大军已经出动!!!");
    }
}
