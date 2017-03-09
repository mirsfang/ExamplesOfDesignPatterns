package structure.flyweight.flyweightAbs;/**
 * Created by MirsFang on 2017/3/9.
 */

/***             
 *作者：MirsFang    
 *模式：享元模式
 *时间：2017/03/09/下午12:32  
 *备注  抽象享元对象
 ***/

public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String Extrinsic;
    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }
    //定义业务操作
    public abstract void operate();
    //内部状态的get和set
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
