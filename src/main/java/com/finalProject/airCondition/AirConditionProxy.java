package com.finalProject.airCondition;

import com.finalProject.airCondition.function.Strategy;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:33
 */
public class AirConditionProxy {
    private AirCondition airCondition;
    private Strategy strategy;
    public AirConditionProxy(Strategy strategy){
        this.strategy = strategy;
    }
    public void useFunction(){
        if(airCondition == null){
            airCondition = new AirCondition(strategy);
        }
        airCondition.useFunction();
    }
}
