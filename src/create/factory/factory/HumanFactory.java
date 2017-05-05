package create.factory.factory;/**
 * Created by MirsFang on 2017/5/5.
 */

import create.factory.AbsHumanFactory;
import create.factory.Human;

/***
 *作者：MirsFang    
 *模式：工厂模式
 *时间：2017/05/05/上午10:17  
 *备注  具体工厂
 ***/

public class HumanFactory extends AbsHumanFactory {
    @Override
    public <T extends Human> T createHumen(Class<T> tClass) {
        Human humen=null;
        try {
            humen= (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)humen;
    }
}
