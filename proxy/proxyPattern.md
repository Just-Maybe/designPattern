#### 代理模式
 
#### 代理模式的定义
    为其他对象提供一种代理以控制对这个对象的访问。
     
#### 代理模式的使用场景
    当无法或不想直接访问某个对象或访问某个对象存在困难时可以通过一个代理对象来间接访问，为了保证客户端使用的透明性，
    委托对象与代理对象需要实现相同的接口
 
  ![image](https://github.com/qqhahaboy/designPattern/raw/master/proxy/proxyUML.png)
 
#### 代理模式的角色介绍
    Subject: 抽象主题类
        该类的主要职责是声明真实主题与代理的共同接口方法，该类既可以是一个抽象类也可以是一个接口。
       
    RealSubject:真实主题类
        该类也称为委托类或被代理类，该类定义了代理所表示的真实对象，由其执行具体的业务逻辑方法，而客户类则通过代理类
        间接地调用真实主题类中定义的方法。
        
    ProxySubject: 代理类
        该类也称为委托类或代理类，该类持有一个对真实主题类的引用，在其所实现的接口方法中调用真实主题类中相应的接口
        方法执行，以此起到代理的作用。
        
    Client: 客户类
        使用代理类的类型。

#### 动态代理与静态代理
    静态代理:
        代理类与 被代理类 实现共同的接口
        代理类 持有 被代理类 的引用
        代理类 中调用 被代理类 的方法

    动态代理:
        代理类 实现InvocationHandler 接口
        ClassLoader 加载被代理的类
        通过Proxy.newProxyInstance();新建代理对象
       
#### Android 源码中的代理模式
    *Android源码里有不少关于代理模式的实现，比如ActivityManagerProxy 代理类，
     其具体代理的是ActivityManagerNative的子类ActivityManagerService(AMS)
     
    *基于Binder 的 IPC机制 与 AIDL
        
