package structure.decorator.decoratorIml;/**
 * Created by MirsFang on 2017/3/1.
 */

import structure.decorator.decoratorAbs.Decorator;
import structure.decorator.decoratorAbs.SchoolReport;

/***
 *作者：MirsFang
 *模式：装饰器模式
 *时间：2017/03/01/下午12:53
 *备注  装饰在学校的表现
 ***/


public class GoodBoyDecortaor extends Decorator {
    public GoodBoyDecortaor(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void goodBoyDecorator(){
        System.out.println("我在学校表现很好,没毛病");
    }

    @Override
    public void report() {
        goodBoyDecorator();
        super.report();

    }
}
