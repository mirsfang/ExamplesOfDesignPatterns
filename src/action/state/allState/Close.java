package action.state.allState;/**
 * Created by MirsFang on 2017/3/16.
 */

import action.state.absState.Context;
import action.state.absState.State;

/***
 *作者：MirsFang
 *模式：状态模式
 *时间：2017/03/16/下午12:23
 *备注  关闭状态
 ***/

public class Close extends State {


    @Override
    public void open() {
        //状态修改
        context.setNowState(Context.open);
        //委托执行
        context.getNowState().open();
    }

    @Override
    public void close() {
       System.out.print("电梯门关闭");
    }

    //运行
    @Override
    public void run() {
        //状态修改
        context.setNowState(Context.run);
        //委托执行
        context.getNowState().run();
    }

    //停止
    @Override
    public void stop() {
        //状态修改
        context.setNowState(Context.stop);
        //委托执行
        context.getNowState().stop();

    }
}
