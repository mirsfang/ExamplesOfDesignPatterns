package structure.decorator.decoratorAbs;/**
 * Created by MirsFang on 2017/3/1.
 */

/***             
 *作者：MirsFang    
 *模式： 装饰器模式
 *时间：2017/03/01/下午12:27  
 *备注  成绩单抽象类
 ***/

public abstract class SchoolReport {

    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:29
    *描述:展示自己的成绩
    **/
    public abstract void report();

    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:29
    *描述:家长签名
    **/
    public abstract void sign(String name);

}
