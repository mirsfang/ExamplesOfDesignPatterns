package structure.adapter;/**
 * Created by MirsFang on 2017/3/10.
 */

import structure.adapter.adapterAbs.IUserInfo;

/***
 *作者：MirsFang    
 *模式：适配器模式
 *时间：2017/03/10/下午1:01  
 *备注  两种不同用户之间的适配
 ***/

public class UserAdapter extends OtherUserInfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println(getUserInfo().get("username"));
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println(getUserInfo().get("address"));
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println(getUserInfo().get("number"));
        return null;
    }

    @Override
    public String getSex() {
        System.out.println(getUserInfo().get("sex"));
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println(getUserJobInfo().get("jobaddress"));
        return null;
    }
}
