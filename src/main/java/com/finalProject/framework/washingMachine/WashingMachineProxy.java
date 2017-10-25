package com.finalProject.framework.washingMachine;

import com.finalProject.applications.OutputsUtil;

/**
 * 洗衣机代理类
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:39
 */
public class WashingMachineProxy extends WashingMachine {
    private WashingMachine washingMachine;
    @Override
    public void washCloth(){
        if(washingMachine == null){
            washingMachine = new WashingMachine();
        }
        System.out.println(OutputsUtil.getOutput(this,"washingMachineProxy","washCloth","washCloth"));
        washingMachine.washCloth();
    }
    public WashingMachine getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }
}
