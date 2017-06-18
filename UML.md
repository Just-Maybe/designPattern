#### UML中类图的几种重要关系及表示

##### 依赖


```Java

    public class A{
        public void method(){
        //B为 A 的局部变量
            B b = new B();
        }
    
    }


```

##### 关联
  
```Java

    public class A{
    //B 为 A的全局变量
        B b = new B();
    }
    
```

##### 继承
    
```Java

    public class A extends B{
    
    }

```

####聚合

```Java
    public class A{
        List<B> list = new ArrayList<B>();
        
        public void add(B b){
            //A 由1个或多个B 组成
            list.add(b);
        }
    }

```
 
##### 接口

```Java
    public class A implements B{
    //  实现B 接口
       @Override
       public void B(){
           
       }
    
    }
    interface B {
    void B();
    }

```
