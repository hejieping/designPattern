package com.finalProject.framework.airCondition;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.HouseholdAppliancesTemplate;
import com.finalProject.framework.airCondition.function.Strategy;
import com.finalProject.framework.bulb.Cloneable;
import com.finalProject.framework.factory.AirConditionStragyFactory;
import com.finalProject.framework.weather.Weather;
import org.springframework.beans.BeanUtils;

/**
 * 空调
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午7:37
 */
public class AirCondition extends HouseholdAppliancesTemplate implements Cloneable {
    private String location;
    private AirConditionStragyFactory airConditionStragyFactory = new AirConditionStragyFactory();
    public void useFunction(){
        //获取天气，根据天气获取相应的策略
        Strategy strategy = (Strategy)(airConditionStragyFactory.produce(Weather.getWeather().nowWeather()));
        //使用策略
        strategy.useFunction();
        System.out.println(OutputsUtil.getOutput(this,location+this.getClass().getSimpleName(),"useFunction","useAircondition"));
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public Object clone() {
        System.out.println(OutputsUtil.getOutput(this,location+this.getClass().getSimpleName(),"clone"," airConditoin clone"));
        AirCondition airCondition = new AirCondition();
        BeanUtils.copyProperties(this,airCondition);
        return airCondition;
    }
}
