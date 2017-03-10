package structure.adapter;/**
 * Created by MirsFang on 2017/3/10.
 */

import structure.adapter.adapterAbs.IOtherInfo;

import java.util.HashMap;

/***
 *作者：MirsFang    
 *模式：适配器模式
 *时间：2017/03/10/下午12:57  
 *备注  其他用户类的实现类
 ***/

public class OtherUserInfo implements IOtherInfo {
    @Override
    public HashMap<String, String> getUserInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("username","员工名称");
        hashMap.put("address","员工住址");
        hashMap.put("number","员工号码");
        hashMap.put("sex","员工性别");
        return hashMap;
    }

    @Override
    public HashMap<String, String> getUserJobInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("jobaddress","员工公司地址");
        return hashMap;
    }
}
