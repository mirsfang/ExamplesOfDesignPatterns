package action.visitor;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorAbs.Element;
import action.visitor.visitorIml.ObjectStruture;
import action.visitor.visitorIml.Visitor;

/***
 *作者：MirsFang    
 *模式：访问者模式
 *时间：2017/03/02/下午12:38  
 *备注  访问者模式主类
 ***/

public class VisitorMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element el= ObjectStruture.createElement();
            el.accept(new Visitor());
        }
    }
}
