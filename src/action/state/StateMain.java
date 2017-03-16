package action.state;/**
 * Created by MirsFang on 2017/3/16.
 */

import action.state.absState.Context;
import action.state.allState.Close;
import action.state.allState.Run;

/***
 *作者：MirsFang    
 *模式：状态模式
 *时间：2017/03/16/下午12:36  
 *备注  执行类
 ***/

public class StateMain {
    public static void main(String[] args) {
        Context context=new Context();
        context.setNowState(new Run());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
