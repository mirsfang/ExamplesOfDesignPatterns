package structure.decorator;/**
 * Created by MirsFang on 2017/3/1.
 */

import structure.decorator.decoratorAbs.SchoolReport;
import structure.decorator.decoratorIml.FouthGradeSchoolReport;
import structure.decorator.decoratorIml.GoodBoyDecortaor;
import structure.decorator.decoratorIml.RankDecortaor;
import structure.decorator.decoratorIml.SuagrFouthGradeSchoolReport;

/***
 *作者：MirsFang    
 *模式：装饰器模式
 *时间：2017/03/01/下午12:34  
 *备注  装饰器模式运行类
 ***/

public class DecoratorMain   {

    public static void main(String[] args) {
        absDecorator();
    }

    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:35
    *描述:一般情况下
    **/
    private static void normol(){
        //把成绩单领回家
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        //家长看成绩单
        schoolReport.report();
        //、、、、挨打
    }

    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:37
    *描述:如果用继承装饰
    **/
    private static void extendsDecorator(){
        SchoolReport schoolReport=new SuagrFouthGradeSchoolReport();
        //家长看成绩单
        schoolReport.report();
        //听你叨叨了几句,感觉考的还行
        schoolReport.sign("马云");

        /**
        * 继承方式的弊端,如果以后要有五年级 六年级 七年级的成绩单,
         * 那么需要你分别对这几个年级的成绩单进行装饰,
         * 如果需要装饰的条件一旦很多,比如说平时表现啊什么的,就得一一去装饰,带来类的爆炸性增长,
        **/
    }


    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:45
    *描述:
     * 利用抽象装饰
    **/
    private static void absDecorator(){
        //*** 注意这边的调用方式 ***

        //原装成绩单
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        //装饰表现
        schoolReport=new GoodBoyDecortaor(schoolReport);
        //装饰排名
        schoolReport=new RankDecortaor(schoolReport);
        //开始汇报
        schoolReport.report();
        //哟西 不错 签名
        schoolReport.sign("马云");
    }



}
