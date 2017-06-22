package com.example.helloworld.androiddesignpattern.factory;

/**
 * Created by helloworld on 2017/6/22.
 */

public class ConcreteFactoryA extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    /**
     *  通过反射获取类
     * @param clz
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
