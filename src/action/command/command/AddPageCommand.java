package action.command.command;/**
 * Created by MirsFang on 2017/3/14.
 */

import action.command.absCommand.Command;

/***
 *作者：MirsFang    
 *模式：命令模式
 *时间：2017/03/14/下午1:06  
 *备注  新增一个页面
 ***/

public class AddPageCommand extends Command {
    @Override
    public void execute() {
        product.getCommand();
        ui.getCommand();
        code.getCommand();

        product.doAdd();
        product.plan();
        ui.doAdd();
        ui.plan();
        code.doAdd();
        code.plan();
    }
}
