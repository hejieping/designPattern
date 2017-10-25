package com.finalProject.framework.telephone;

import com.finalProject.framework.airCondition.AirConditionProxy;
import com.finalProject.framework.bulb.BulbProxy;
import com.finalProject.framework.cooker.CookerInvoker;
import com.finalProject.framework.cooker.Observer;
import com.finalProject.framework.television.TelevisionProxy;
import com.finalProject.framework.washingMachine.WashingMachineProxy;

/**
 * 智能家电APP
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:08
 */
public class SmartAppliancesAppFacade implements Observer {

    private CookerInvoker cookerInvoker = new CookerInvoker();
    /**
     * 各个家电的代理类
     */
    private AirConditionProxy airConditionProxy = new AirConditionProxy();
    private BulbProxy bulbProxy = new BulbProxy();
    private TelevisionProxy televisionProxy = new TelevisionProxy();
    private WashingMachineProxy washingMachineProxy = new WashingMachineProxy();

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

    public CookerInvoker getCookerInvoker() {
        return cookerInvoker;
    }

    public void setCookerInvoker(CookerInvoker cookerInvoker) {
        this.cookerInvoker = cookerInvoker;
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
