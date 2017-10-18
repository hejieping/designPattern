package com.finalProject.washingMachine;

import com.finalProject.HouseholdAppliances;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:12
 */
public class WashingMachine extends HouseholdAppliances {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void washCloth(){
        state.handle(this);
    }
}
