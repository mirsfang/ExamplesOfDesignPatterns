package structure.proxy.staticProxy;


/***
 *作者：MirsFang
 *模式：代理模式
 *时间：2017/2/28/
 *备注  代理模式代理类
 ***/
public class Proxy implements Subject {
    private Subject realSuject;

    public Proxy(Subject realSuject) {
        this.realSuject = realSuject;
    }

    @Override
    public void request() {
        if(realSuject!=null){
            realSuject.request();
        }
    }
}
