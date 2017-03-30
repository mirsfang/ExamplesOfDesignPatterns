package action.state.allState;/**
 * Created by MirsFang on 2017/3/16.
 */

import action.state.absState.Context;
import action.state.absState.State;

/***
 *作者：MirsFang
 *模式：状态模式
 *时间：2017/03/16/下午12:23
 *备注  运行状态   //
 ***/

public class Run extends State {


    //运行状态不糊开门
    @Override
    public void open() {
        //状态修改
    }

    //运行状态门就是观者的
    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    //停止运行
    @Override
    public void stop() {
        context.setNowState(Context.stop);
        context.getNowState().stop();
    }
}
