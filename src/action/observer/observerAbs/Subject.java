package action.observer.observerAbs;/**
 * Created by MirsFang on 2017/3/3.
 */

/***             
 *作者：MirsFang    
 *模式：观察者模式
 *时间：2017/03/03/下午12:59  
 *备注  抽像女神(被观察者)
 ***/

public interface Subject {
    //添加一个观察者
    public void Attach(Observer observer);
    //删除一个观察者
    public void Detach(Observer observer);
    //通知所有的观察者
    public void Notify();
}
