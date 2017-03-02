package action.visitor.visitorIml;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorAbs.Element;
import action.visitor.visitorAbs.IVisitor;

import java.util.Random;

/***
 *作者：MirsFang    
 *模式：访问者模式
 *时间：2017/03/02/下午12:30  
 *备注  具体元素--用户
 ***/

    public class ConcreateElementUser extends Element {

    @Override
    public void doVisite() {
        Random random=new Random();
        System.out.println("我是用户,在线时长 "+random.nextInt(100)+" 分钟 ***********");
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
