package com.finalProject.framework.airCondition;

import com.finalProject.framework.airCondition.function.Strategy;
import com.finalProject.framework.HouseholdAppliancesTemplate;

/**
 * 空调
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午7:37
 */
public class AirCondition extends HouseholdAppliancesTemplate {
    //空调使用的功能
    private Strategy strategy;
    public AirCondition(Strategy strategy){
        this.strategy = strategy;
    }
    public void useFunction(){
        strategy.useFunction();
    }
}
