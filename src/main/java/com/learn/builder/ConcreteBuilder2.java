package com.learn.builder;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class ConcreteBuilder2 implements Builder{
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
