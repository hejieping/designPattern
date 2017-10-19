package com.finalProject.framework.airCondition;

import com.finalProject.framework.airCondition.function.Strategy;

/**
 * 空调代理类
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
