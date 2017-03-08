package create.prototype;/**
 * Created by MirsFang on 2017/3/8.
 */

import com.sun.xml.internal.rngom.parse.host.Base;
import create.prototype.prototypeAbs.BaseMessage;

/***
 *作者：MirsFang    
 *模式： 原型模式
 *时间：2017/03/08/下午12:21  
 *备注  浅拷贝的对象
 ***/

public class ShallowCopy  extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy=null;
        try {
            shallowCopy= (ShallowCopy) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return shallowCopy;
    }


}
