package structure.flyweight;/**
 * Created by MirsFang on 2017/3/9.
 */

import structure.flyweight.flyweightAbs.Flyweight;

/***
 *作者：MirsFang    
 *模式：享元模式
 *时间：2017/03/09/下午12:44  
 *备注  享元模式执行类
 ***/

public class FlyweightMain {


    public static void main(String[] args) {
        Flyweight fly1;
        Flyweight fly2;
        Flyweight fly3;
        Flyweight fly4;
        Flyweight fly5;
        Flyweight fly6;

        //根据类型创建订单对象
        fly1 = FlyweightFactory.getFlyweight("图书");
        fly2 = FlyweightFactory.getFlyweight("图书");
        fly3 = FlyweightFactory.getFlyweight("图书");
        fly4 = FlyweightFactory.getFlyweight("图书");
        fly5 = FlyweightFactory.getFlyweight("你懂得");
        fly6 = FlyweightFactory.getFlyweight("女神娃娃");

        //调用
        fly1.operate();
        fly2.operate();
        fly3.operate();
        fly4.operate();
        fly5.operate();
        fly6.operate();

        //查看池中对象的数量
        System.out.print("pool 中对象的大小 = "+FlyweightFactory.getPoolSize());

    }


}
