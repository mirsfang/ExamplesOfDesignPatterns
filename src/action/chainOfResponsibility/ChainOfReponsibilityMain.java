package action.chainOfResponsibility;/**
 * Created by MirsFang on 2017/3/6.
 */

import action.chainOfResponsibility.abs.Handler;

/***
 *作者：MirsFang    
 *模式：责任链模式
 *时间：2017/03/06/下午12:47  
 *备注  准备开始走流程
 ***/

public class ChainOfReponsibilityMain {

    public static void main(String[] args) {
        //我要报销的钱数;
        int money=5;
        //初始化各个处理者
        Handler manager = new ManagerHandler();
        Handler finance = new FinanceHandler();
        Handler boss = new BossHandler();
        //设置链中的顺序
        manager.setNextHandler(finance);
        finance.setNextHandler(boss);
        //开始请求
        System.out.println("我要报销"+money+"元");
        if (manager.handlerRequst(money)) {
            System.out.println("报销成功");
        } else {
            System.out.println("报销失败");
        }
    }

}
