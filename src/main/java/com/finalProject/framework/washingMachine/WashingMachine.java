package com.finalProject.framework.washingMachine;

import com.finalProject.framework.HouseholdAppliancesTemplate;
import com.finalProject.framework.washingMachine.impl.WaterState;

/**
 * 洗衣机
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:12
 */
public class WashingMachine extends HouseholdAppliancesTemplate {
    private State state = new WaterState();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void washCloth(){
        state.handle(this);
        state.handle(this);
        state.handle(this);
        state.handle(this);
    }
}
