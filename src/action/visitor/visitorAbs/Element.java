package action.visitor.visitorAbs;/**
 * Created by MirsFang on 2017/3/2.
 */

/***             
 *作者：MirsFang    
 *模式：访问者模式
 *时间：2017/03/02/下午12:28  
 *备注  具体元素
 ***/

public abstract   class Element {
    //定义访问逻辑
    public abstract void doVisite();
    //定义谁能访问
    public abstract void accept(IVisitor iVisitor);
}
