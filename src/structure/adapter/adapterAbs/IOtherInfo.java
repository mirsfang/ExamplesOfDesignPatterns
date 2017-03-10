package structure.adapter.adapterAbs;/**
 * Created by MirsFang on 2017/3/10.
 */

import java.util.HashMap;

/***
 *作者：MirsFang    
 *模式：适配器模式
 *时间：2017/03/10/下午12:52  
 *备注  需要对接的用户接口类
 ***/

public interface IOtherInfo {
    HashMap<String,String> getUserInfo();
    HashMap<String,String> getUserJobInfo();
}
