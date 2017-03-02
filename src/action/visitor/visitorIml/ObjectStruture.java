package action.visitor.visitorIml;/**
 * Created by MirsFang on 2017/3/2.
 */

import action.visitor.visitorAbs.Element;

import java.util.Random;

/***
 *作者：MirsFang    
 *模式：访问者模式
 *时间：2017/03/02/下午12:36  
 *备注  结构对象,获取一个Element,现实中的数据源
 ***/

public class ObjectStruture {
    /**
    *
    *作者:Mirsfang
    *日期:2017/3/2/下午12:37
    *描述:返回一个具体的Element
    **/
    public static Element createElement(){
        Random random=new Random();
        if(random.nextInt(100)>50){
            return new ConcreateElementUser();
        }else {
            return new ConcreateElementAdmin();
        }
    }
}
