package action.command.absCommand;/**
 * Created by MirsFang on 2017/3/14.
 */

/***             
 *作者：MirsFang    
 *模式： 命令模式
 *时间：2017/03/14/下午12:58  
 *备注  抽象执行者
 ***/

public abstract class Group {
    //得到命令
   public abstract void getCommand();
    //新增一个功能
    public abstract void doAdd();
    //减去一个功能
    public abstract  void doDel();
    //开始实施
    public abstract void plan();

}
