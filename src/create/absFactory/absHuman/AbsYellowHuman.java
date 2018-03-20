package create.absFactory.absHuman;/**
 * Created by MirsFang on 2017/5/5.
 */

import create.absFactory.Human;

/***
 *作者：MirsFang    
 *模式：抽象工厂模式
 *时间：2017/05/05/上午10:54  
 *备注  抽象黄种人
 ***/

public abstract class AbsYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

}
