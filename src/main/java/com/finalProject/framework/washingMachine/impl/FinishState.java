package com.finalProject.framework.washingMachine.impl;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.washingMachine.State;
import com.finalProject.framework.washingMachine.WashingMachine;

/**
 * 结束状态
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:21
 */
public class FinishState implements State {
    @Override
    public void handle(WashingMachine washingMachine) {
        System.out.println(OutputsUtil.getOutput(washingMachine,"washingMachine","washing","state:Finish"));
        washingMachine.setState(new WaterState());
    }
}
