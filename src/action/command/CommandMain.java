package action.command;/**
 * Created by MirsFang on 2017/3/14.
 */

import action.command.command.AddPageCommand;

/***
 *作者：MirsFang    
 *模式：命令模式
 *时间：2017/03/14/下午1:10  
 *备注  执行类
 ***/

public class CommandMain {

    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        invoker.setCommand(new AddPageCommand());
        invoker.Action();
    }

}
