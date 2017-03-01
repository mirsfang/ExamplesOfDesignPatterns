package structure.decorator.decoratorIml;/**
 * Created by MirsFang on 2017/3/1.
 */

import structure.decorator.decoratorIml.FouthGradeSchoolReport;

/***
 *作者：MirsFang    
 *模式：装饰器模式
 *时间：2017/03/01/下午12:38  
 *备注      
 ***/

public class SuagrFouthGradeSchoolReport extends FouthGradeSchoolReport {

    /**
    *
    *作者:Mirsfang
    *日期:2017/3/1/下午12:39
    *描述:先把最高成绩说出去
    **/
    private void reportHighSorce(){
        System.out.print("我英语得了90分,语文得了80分");
    }

    @Override
    public void report() {
        reportHighSorce();
        super.report();
    }
}

