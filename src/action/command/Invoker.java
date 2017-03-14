package action.command;/**
 * Created by MirsFang on 2017/3/14.
 */

import action.command.absCommand.Command;

/***
 *作者：MirsFang    
 *模式：命令模式
 *时间：2017/03/14/下午1:09  
 *备注  负责人
 ***/

public class Invoker   {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setCommand(String str) {

    }

    public  void Action() {
        this.command.execute();
    }
}
