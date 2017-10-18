package com.finalProject.telephone;

import com.finalProject.airCondition.AirConditionProxy;
import com.finalProject.bulb.BulbProxy;
import com.finalProject.cooker.CookerProxy;
import com.finalProject.cooker.Observer;
import com.finalProject.television.TelevisionProxy;
import com.finalProject.washingMachine.WashingMachineProxy;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:08
 */
public class SmartAppliancesAppFacade implements Observer {
    private AirConditionProxy airConditionProxy;
    private BulbProxy bulbProxy;
    private CookerProxy cookerProxy;
    private TelevisionProxy televisionProxy;
    private WashingMachineProxy washingMachineProxy;

    public AirConditionProxy getAirConditionProxy() {
        return airConditionProxy;
    }

    public void setAirConditionProxy(AirConditionProxy airConditionProxy) {
        this.airConditionProxy = airConditionProxy;
    }

    public BulbProxy getBulbProxy() {
        return bulbProxy;
    }

    public void setBulbProxy(BulbProxy bulbProxy) {
        this.bulbProxy = bulbProxy;
    }

    public CookerProxy getCookerProxy() {
        return cookerProxy;
    }

    public void setCookerProxy(CookerProxy cookerProxy) {
        this.cookerProxy = cookerProxy;
    }

    public TelevisionProxy getTelevisionProxy() {
        return televisionProxy;
    }

    public void setTelevisionProxy(TelevisionProxy televisionProxy) {
        this.televisionProxy = televisionProxy;
    }

    public WashingMachineProxy getWashingMachineProxy() {
        return washingMachineProxy;
    }

    public void setWashingMachineProxy(WashingMachineProxy washingMachineProxy) {
        this.washingMachineProxy = washingMachineProxy;
    }

    @Override
    public void getNotify() {

    }
}
