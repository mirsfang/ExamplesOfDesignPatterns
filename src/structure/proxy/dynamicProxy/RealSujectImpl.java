package structure.proxy.dynamicProxy;/**
 * Created by MirsFang on 2017/2/28.
 */

/***             
 *作者：MirsFang    
 *模式：代理模式
 *时间：2017/02/28/下午12:39  
 *备注  动态代理真实类
 ***/

public class RealSujectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("do request");
    }

}
