package com.sejong.gofdesign.FactoryPattern;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NY Style Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("NY Style Cheese Bake");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cheese Cut");
    }

    @Override
    public void box() {
        System.out.println("NY Style Cheese Box");
    }
}
