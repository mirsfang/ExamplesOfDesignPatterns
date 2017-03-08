package create.prototype;/**
 * Created by MirsFang on 2017/3/8.
 */

import java.util.ArrayList;

/***
 *作者：MirsFang    
 *模式：原型模式
 *时间：2017/03/08/下午12:21  
 *备注  原型模式执行类
 ***/

public class PrototypeMain {

    public static void main(String[] args) {
//        shallowCopy();
        deepCopy();
    }

    /**
    *  浅拷贝
    *作者:Mirsfang
    *日期:2017/3/8/下午12:27
    *描述: 执行完可以看到 ShallowCopy 里面的arrayList一直是一个,没有变动过,所有在添加图片的时候,会再原有的基础上添加
    **/
    private static void shallowCopy(){
        ShallowCopy shallow=new ShallowCopy();
        shallow.setMessage("先生,您好。您的充气娃娃已经收货");
        shallow.setSend("MirsFang");

        for (int i = 0; i < 3; i++) {
            shallow.addImage("图片"+i);
        }

        for (int i = 0; i < 10 ; i++) {
            try {
                ShallowCopy sendMsg= (ShallowCopy) shallow.clone();
                sendMsg.setReceiver("顾客"+i);
                //添加顾客的充气娃娃照片
                sendMsg.addImage(sendMsg.getReceiver()+i);
                sendMsg.sendMessage();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
    *  深拷贝
    *作者:Mirsfang
    *日期:2017/3/8/下午12:48
    *描述:执行完可以看到 充气娃娃图片的数量一直是4,说明里面的arrayList clone的时候里面只有原来的三个,并没有之前增加的
    **/
    private static void deepCopy(){
        DeepCopy deepCopy=new DeepCopy();
        deepCopy.setMessage("先生,您好。您的充气娃娃已经收货");
        deepCopy.setSend("MirsFang");

        for (int i = 0; i < 3; i++) {
            deepCopy.addImage("图片"+i);
        }

        for (int i = 0; i < 10 ; i++) {
            try {
                DeepCopy sendMsg= (DeepCopy) deepCopy.clone();
                sendMsg.setReceiver("顾客"+i);
                //添加顾客的充气娃娃照片
                sendMsg.addImage(sendMsg.getReceiver()+i);
                sendMsg.sendMessage();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
