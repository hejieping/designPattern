package com.finalProject.framework.airCondition;

import java.util.Map;

import com.finalProject.applications.OutputsUtil;
import com.google.common.collect.Maps;

/**
 * 空调代理类
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:33
 */
public class AirConditionProxy extends AirCondition {
    private Map<String,AirCondition> airConditionMap = Maps.newHashMap();
    /**
     * 使用空调功能
     * @param location
     */
    public void useFunction(String location){
        System.out.println(OutputsUtil.getOutput(this,"airConditionProxy","useFunction","use AirCondition function"));
        airConditionMap.get(location).useFunction();
    }
    public void setAirCondition(AirCondition airCondition) {
        airConditionMap.put(airCondition.getLocation(),airCondition);
    }
    public void removeAirCondition(AirCondition airCondition){
        airConditionMap.remove(airCondition.getLocation());
    }
}
