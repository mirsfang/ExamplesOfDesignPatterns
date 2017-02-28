#代理模式

> 为其他的对象提供一种可控制访问的当前对象的中间类


ProxyMain  代理模式的运行测试类

* 静态代理(staticProxy)

|类名|描述|
|-----|-----|
|RealSubject|委托类|
|Proxy|代理类|
|Subject | 接口|

*动态代理(dynamicProxy)

|类名|描述|
|-----|-----|
|RealSubjectIml|委托类|
|SubjectInvocationHandler|利用反射定义代理类的实现|
|Subject| 接口|