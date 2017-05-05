package create.factory;/**
 * Created by MirsFang on 2017/5/5.
 */

import create.factory.factory.HumanFactory;
import create.factory.human.BlackHuman;
import create.factory.human.WhiteHuman;
import create.factory.human.YellowHuman;

/***
 *作者：MirsFang    
 *模式：工厂模式
 *时间：2017/05/05/上午10:28  
 *备注  执行类
 ***/

public class FactoryMain {
    public static void main(String[] args) {

        //初始化一个工厂
        AbsHumanFactory humanFactory = new HumanFactory();

        //建造一个黄种人
        Human yellowHuman = humanFactory.createHumen(YellowHuman.class);
        yellowHuman.getColor();

        //建造一个黑人
        Human blackHuman = humanFactory.createHumen(BlackHuman.class);
        blackHuman.getColor();

        //建造一个白人
        Human whiteHuman = humanFactory.createHumen(WhiteHuman.class);
        whiteHuman.getColor();

    }
}
