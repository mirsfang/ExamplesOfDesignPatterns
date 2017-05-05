package create.factory.human;/**
 * Created by MirsFang on 2017/5/5.
 */

import create.factory.Human;

/***
 *作者：MirsFang
 *模式：工厂模式
 *时间：2017/05/05/上午10:22
 *备注  黄人
 ***/

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }
}
