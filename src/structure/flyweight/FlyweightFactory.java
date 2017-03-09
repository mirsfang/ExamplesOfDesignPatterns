package structure.flyweight;/**
 * Created by MirsFang on 2017/3/9.
 */

import structure.flyweight.flyweightAbs.Flyweight;

import java.util.HashMap;

/***
 *作者：MirsFang    
 *模式：享元模式
 *时间：2017/03/09/下午12:38  
 *备注  享元工厂
 ***/

public class FlyweightFactory {
    //定义一个池容器
    private static HashMap<String,Flyweight> pool=new HashMap<>();

    public static Flyweight getFlyweight(String Extrinsic){
        //需要返回的对象
        Flyweight flyweight=null;
        if(pool.containsKey(Extrinsic)){
            flyweight=pool.get(Extrinsic);
        }else {
            flyweight=new ConcreateFlyweight_1(Extrinsic);
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }


    //获取池的大小
    public static  int getPoolSize(){
        return pool.size();
    }
}
