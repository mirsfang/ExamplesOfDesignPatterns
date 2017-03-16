package action.state.absState;/**
 * Created by MirsFang on 2017/3/16.
 */

/***
 *作者：MirsFang    
 *模式：状态模式
 *时间：2017/03/16/下午12:13  
 *备注  抽象状态角色
 ***/

public abstract class State {
    protected Context context;

    //设置状态
    public void setContext(Context context) {
        this.context = context;
    }

    //电梯门开启的动作
    public abstract void open();
    //电梯门关闭的动作
    public abstract void close();
    //电梯运行起来
    public abstract void run();
    //电梯停下来
    public abstract void stop();
}
