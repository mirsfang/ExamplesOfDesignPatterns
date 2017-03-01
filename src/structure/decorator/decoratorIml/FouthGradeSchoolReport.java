package structure.decorator.decoratorIml;/**
 * Created by MirsFang on 2017/3/1.
 */

import structure.decorator.decoratorAbs.SchoolReport;

/***
 *作者：MirsFang    
 *模式：装饰器模式
 *时间：2017/03/01/下午12:30  
 *备注  四年级成绩单
 ***/

public class FouthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        System.out.print("数学60,语文:80,英语:90");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名 : "+name);
    }

}
