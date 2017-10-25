package com.finalProject.framework.factory;

import com.finalProject.applications.Constants;
import com.finalProject.framework.airCondition.function.impl.DehumidificationStrategy;
import com.finalProject.framework.airCondition.function.impl.HotAirStrategy;
import com.finalProject.framework.airCondition.function.impl.RefrigerationStrategy;

/**
 * 空调功能工厂
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/20 上午10:53
 */
public class AirConditionStragyFactory implements Factory {

    @Override
    public Object produce(String type) {
        if(type.equals(Constants.SUMMER)){
            return new RefrigerationStrategy();
        }
        if(type.equals(Constants.WINTER)){
            return new HotAirStrategy();
        }
        if(type.equals(Constants.SUMMER)){
            return new DehumidificationStrategy();
        }
        return new RefrigerationStrategy();
    }
}
