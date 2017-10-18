package com.finalProject.airCondition;

import com.finalProject.airCondition.function.Strategy;
import com.finalProject.HouseholdAppliances;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午7:37
 */
public class AirCondition extends HouseholdAppliances {
    private Strategy strategy;
    public AirCondition(Strategy strategy){
        this.strategy = strategy;
    }
    public void useFunction(){
        strategy.useFunction();
    }
}
