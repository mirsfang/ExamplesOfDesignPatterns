package action.command.absCommand;/**
 * Created by MirsFang on 2017/3/14.
 */

import action.command.Code;
import action.command.Product;
import action.command.UI;

/***
 *作者：MirsFang    
 *模式： 命令模式
 *时间：2017/03/14/下午12:57  
 *备注  处理命令
 ***/

public abstract class Command {
    protected Product product=new Product();
    protected UI ui=new UI();
    protected Code code =new Code();
    //执行
    public abstract void execute();
}
