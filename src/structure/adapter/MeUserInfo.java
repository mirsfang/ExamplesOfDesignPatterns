package structure.adapter;/**
 * Created by MirsFang on 2017/3/10.
 */

import structure.adapter.adapterAbs.IUserInfo;

/***
 *作者：MirsFang    
 *模式：适配器模式
 *时间：2017/03/10/下午12:48  
 *备注  我们自己的用户类
 ***/

public class MeUserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.print("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.print("员工住址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.print("员工号码");
        return null;
    }

    @Override
    public String getSex() {
        System.out.print("员工性别");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.print("员工公司地址");
        return null;
    }
}
