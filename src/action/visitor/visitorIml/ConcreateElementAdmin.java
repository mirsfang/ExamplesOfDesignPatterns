package action.visitor.visitorIml;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorAbs.Element;
import action.visitor.visitorAbs.IVisitor;

/***
 *作者：MirsFang    
 *模式：  访问者模式
 *时间：2017/03/02/下午12:31  
 *备注    具体元素--管理员
 ***/

public class ConcreateElementAdmin extends Element {
    @Override
    public void doVisite() {
        System.out.println("我是管理员 活动了20分种,系统操作:删除了好多文件  ***********");
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
