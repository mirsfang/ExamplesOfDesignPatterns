package action.visitor.visitorAbs;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorIml.ConcreateElementAdmin;
import action.visitor.visitorIml.ConcreateElementUser;

/***
 *作者：MirsFang    
 *模式：访问者模式
 *时间：2017/03/02/下午12:26  
 *备注  抽象访问者
 ***/

public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreateElementUser user);
    public void visit(ConcreateElementAdmin admin);
}
