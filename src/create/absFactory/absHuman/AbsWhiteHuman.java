package create.absFactory.absHuman;/**
 * Created by MirsFang on 2017/5/5.
 */

import create.absFactory.Human;

/***
 *作者：MirsFang    
 *模式：抽象工厂
 *时间：2017/05/05/上午11:03  
 *备注  抽象白色人种
 ***/

public abstract  class AbsWhiteHuman  implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }
}
