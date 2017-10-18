package com.finalProject.bulb;

import com.finalProject.HouseholdAppliances;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:20
 */
public class Bulb  extends HouseholdAppliances implements Cloneable{
    private String location;
    @Override
    public Object clone() {
        Bulb bulb = new Bulb();
        return bulb;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
