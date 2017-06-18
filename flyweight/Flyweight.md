#### 享元模式
 
#### 享元模式定义
    使用共享对象可有效地支持大量的细粒度的对象
    
#### 享元模式的使用场景
    1、系统中存在大量的相似对象。
    2、细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。
    3、需要缓冲池的场景。
 
#### 角色介绍
    Flyweight:享元对象抽象基类或者杰克。
    ConcreteFlyweiht: 具体的享元对象。
    FlyweightFactory：享元工厂，负责管理享元对象池和创建享元对象。
    
#### String 中的缓存常量池

```Java
    class StringTest{
        public static void main(string[] args){
            String str1 = new String("abc");
            String str2 = "abc";
            String str3 = new String("abc");
            String str4 = "ab"+"c";
        
            //使用equals 只判断字符串值
            System.out.print(str1.equals(str2));    //true
            System.out.print(str1.equals(str3));    //true
            System.out.print(str3.equals(str2));    //true
        
            // "=="等号判断，判定两个对象是不是同一地址
            System.out.print(str1==str2);   //false
            System.out.print(str1==str3);   //false
            System.out.print(str3==str2);   //false
            System.out.print(str4==str2);   //true  
            //str2和str4 是同一字符串对象。因为str4使用了缓存在常量池中的str2对象
        }
    }
```
 
#### 总结
    享元模式实现比较简单，但是它的作用在某些场景确实及其重要的。它可以大大减少应用程序创建的对象，降低程序内存的占用，
    增强程序的性能，但他同时也提高了系统的复杂性，需要分离出外部状态和内部状态，而且外部状态具有固化特性，不应该随
    内部状态改变而改变，否则导致系统的逻辑混乱。
     
    享元模式的有点在于它大幅度地降低内存中对象的数量。但是，它做到这一点所付出的代价也是很高的。
     
    * 享元模式使得系统更加复杂。为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。
    * 享元模式将享元对象的状态外部化，而读取外部状态使得运行时间稍微变长。