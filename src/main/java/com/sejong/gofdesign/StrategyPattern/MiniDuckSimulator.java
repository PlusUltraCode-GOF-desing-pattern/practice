package com.sejong.gofdesign.StrategyPattern;

import com.sejong.gofdesign.StrategyPattern.duck.DonghoDuck;
import com.sejong.gofdesign.StrategyPattern.fly.FlyRocketWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        DonghoDuck donghoDuck = new DonghoDuck();
        donghoDuck.performQuack();
        donghoDuck.performFly();

        donghoDuck.setFlyBehavior(new FlyRocketWings());
        donghoDuck.performFly();
    }
}
