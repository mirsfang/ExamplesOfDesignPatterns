package action.visitor.visitorIml;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorAbs.IVisitor;

/***
 *作者：MirsFang    
 *模式： 访问者模式
 *时间：2017/03/02/下午12:33  
 *备注  具体的访问者
 ***/

public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreateElementUser user) {
        user.doVisite();
    }

    @Override
    public void visit(ConcreateElementAdmin admin) {
        admin.doVisite();
    }
}
