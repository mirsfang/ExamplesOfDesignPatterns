package create.prototype;/**
 * Created by MirsFang on 2017/3/8.
 */

import create.prototype.prototypeAbs.BaseMessage;

import java.util.ArrayList;

/***
 *作者：MirsFang    
 *模式：原型模式
 *时间：2017/03/08/下午12:21  
 *备注  原型模式深拷贝
 ***/

public class DeepCopy   extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy=null;
        try {
            deepCopy= (DeepCopy) super.clone();
            this.setImgList((ArrayList<String>) this.getImgList().clone());
        }catch (Exception e){
            e.printStackTrace();
        }
        return deepCopy;
    }
}
