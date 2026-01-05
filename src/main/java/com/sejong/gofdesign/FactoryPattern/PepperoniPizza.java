package com.sejong.gofdesign.FactoryPattern;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare PepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake PepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut PepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("Box PepperoniPizza");
    }
}
