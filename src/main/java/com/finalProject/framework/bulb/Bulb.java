package com.finalProject.framework.bulb;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.HouseholdAppliancesTemplate;
import org.springframework.beans.BeanUtils;

/**
 * 电灯
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:20
 */
public class Bulb  extends HouseholdAppliancesTemplate implements Cloneable{
    /**
     * 电灯摆放位置
     */
    private String location;
    /**
     * 电灯功率
     */
    private String power;
    @Override
    public Bulb clone() {
        System.out.println(OutputsUtil.getOutput(this,location+this.getClass().getSimpleName(),"clone","bulb clone"));
        Bulb bulb = new Bulb();
        BeanUtils.copyProperties(this,bulb);
        return bulb;
    }
    @Override
    public void on(){
        System.out.println(OutputsUtil.getOutput(this,location+this.getClass().getSimpleName(),"on","turn on bulb"));
    }
    @Override
    public void off(){
        System.out.println(OutputsUtil.getOutput(this,location+this.getClass().getSimpleName(),"off","turn off bulb"));
    }
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
