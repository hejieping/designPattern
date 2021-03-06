package com.finalProject.framework.washingMachine.impl;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.washingMachine.State;
import com.finalProject.framework.washingMachine.WashingMachine;

/**
 * 洗涤状态
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:16
 */
public class RinseState implements State {
    @Override
    public void handle(WashingMachine washingMachine) {
        System.out.println(OutputsUtil.getOutput(washingMachine,"washingMachine","washing","state:Rinse"));
        washingMachine.setState(new DehydrateState());
    }
}
