package com.finalProject.washingMachine.impl;

import com.finalProject.washingMachine.State;
import com.finalProject.washingMachine.WashingMachine;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:16
 */
public class DehydrateState implements State {
    @Override
    public void handle(WashingMachine washingMachine) {
        washingMachine.setState(new FinishState());
    }
}
