package com.finalProject.framework.bulb;

import com.finalProject.framework.HouseholdAppliancesTemplate;

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

        Bulb bulb = new Bulb();
        bulb.setLocation(location);
        bulb.setPower(power);
        return bulb;
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
