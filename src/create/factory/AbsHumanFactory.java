package create.factory;/**
 * Created by MirsFang on 2017/5/5.
 */

/***             
 *作者：MirsFang    
 *模式：工厂模式
 *时间：2017/05/05/上午10:12  
 *备注  抽象出来的工厂
 ***/

public abstract class AbsHumanFactory {
    public abstract <T extends Human> T createHumen(Class<T> tClass);
}
