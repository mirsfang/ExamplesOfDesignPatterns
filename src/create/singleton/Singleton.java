package create.singleton;

/**
 * @author PhxNirvana 2017/3/14 0014.
 * 双重锁的单例
 */

public class Singleton {
    //防止外部创建实例
    private Singleton() {
        //To save singleton from reflection
        if(mInstance != null) {
            throw new InstantiationError("Already there");
        }
    }
    //唯一实例
    private static volatile Singleton mInstance;

    public static Singleton getInstance() {
        //第一个锁，如果没有实例
        if (mInstance == null) {
            synchronized (Singleton.class) {
                //第二个锁，如果没有任何线程创建Singleton实例
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    
     //To save singleton from Deserialization
    protected Object readResolve() {
        return mInstance;
    }
}
