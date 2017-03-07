package action.chainOfResponsibility;/**
 * Created by MirsFang on 2017/3/6.
 */

import action.chainOfResponsibility.abs.Handler;

/***
 *作者：MirsFang
 *模式：责任链模式
 *时间：2017/03/06/下午12:45
 *备注  公司财务,李财务
 ***/

public class FinanceHandler extends Handler {

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public String getnName() {
        return "李财务";
    }
}
