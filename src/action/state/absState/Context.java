package action.state.absState;/**
 * Created by MirsFang on 2017/3/16.
 */

import action.state.allState.Close;
import action.state.allState.Open;
import action.state.allState.Run;
import action.state.allState.Stop;

/***
 *作者：MirsFang    
 *模式：状态模式
 *时间：2017/03/16/下午12:14  
 *备注  上下文环境
 ***/

public class Context {

    //定义出所有的电梯状态  用在setState();
    public static final Open open=new Open();
    public static final Close close=new Close();
    public static final Run run=new Run();
    public static final Stop stop=new Stop();

    //当前的状态
    private State nowState;

    public void setNowState(State nowState) {
        this.nowState = nowState;
        this.nowState.setContext(this);
    }

    public State getNowState() {
        return nowState;
    }

    public void open(){
        nowState.open();
    }

    public void close(){
        nowState.close();
    }

    public void run(){
        nowState.run();
    }

    public void stop(){
        nowState.stop();
    }
}
