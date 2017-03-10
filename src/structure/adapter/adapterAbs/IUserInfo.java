package structure.adapter.adapterAbs;/**
 * Created by MirsFang on 2017/3/10.
 */

/***             
 *作者：MirsFang    
 *模式：适配器模式
 *时间：2017/03/10/下午12:42  
 *备注  抽象用户类
 ***/

public interface IUserInfo {
    //看名字就知道是啥。。这里就不写了
    String getUserName();
    String getHomeAddress();
    String getMobileNumber();
    String getSex();
    String getJobPosition();
}
