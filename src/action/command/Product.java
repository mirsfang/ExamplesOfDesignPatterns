package action.command;/**
 * Created by MirsFang on 2017/3/14.
 */

import action.command.absCommand.Group;

/***
 *作者：MirsFang    
 *模式：命令模式
 *时间：2017/03/14/下午1:01
 *备注  产品经理
 ***/

public class Product extends Group {


    @Override
    public void getCommand() {
        System.out.println("产品经理收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("产品经理新增了一个需求");
    }

    @Override
    public void doDel() {
        System.out.println("产品经理砍掉了一个需求");
    }

    @Override
    public void plan() {
        System.out.println("产品变更完毕");
    }
}
