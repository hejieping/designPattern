package com.finalProject.framework;

import java.util.List;

import com.finalProject.applications.Constants;
import com.finalProject.framework.airCondition.AirCondition;
import com.finalProject.framework.bulb.Bulb;
import com.finalProject.framework.cooker.Cooker;
import com.finalProject.framework.cooker.CookerInvoker;
import com.finalProject.framework.television.OldTelevision;
import com.finalProject.framework.washingMachine.WashingMachine;
import com.google.common.collect.Lists;

/**
 * 公共家电 单例模式
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/21 下午2:07
 */
public class PublicHouseholdAppliance {
    private AirCondition airCondition;
    private List<Bulb> bulbList = Lists.newArrayList();
    private Cooker cooker;
    private OldTelevision oldTelevision;
    private WashingMachine washingMachine;
    private CookerInvoker cookerInvoker;
    public AirCondition getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public List<Bulb> getBulbList() {
        return bulbList;
    }

    public void setBulbList(List<Bulb> bulbList) {
        this.bulbList = bulbList;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    public OldTelevision getOldTelevision() {
        return oldTelevision;
    }

    public void setOldTelevision(OldTelevision oldTelevision) {
        this.oldTelevision = oldTelevision;
    }

    public WashingMachine getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public CookerInvoker getCookerInvoker() {
        return cookerInvoker;
    }

    public void setCookerInvoker(CookerInvoker cookerInvoker) {
        this.cookerInvoker = cookerInvoker;
    }

    private PublicHouseholdAppliance(){
        airCondition = new AirCondition();
        airCondition.setLocation(Constants.LOCATION_HALL);
        Bulb hallBulb = new Bulb();
        Bulb restroomBulb = hallBulb.clone();
        hallBulb.setLocation(Constants.LOCATION_HALL);
        restroomBulb.setLocation(Constants.LOCATION_RESTROOM);
        bulbList.add(hallBulb);
        bulbList.add(restroomBulb);
        oldTelevision = new OldTelevision();
        washingMachine = new WashingMachine();
        cookerInvoker = new CookerInvoker();
    }
    public static class PHA{
        private static final PublicHouseholdAppliance PUBLIC_HOUSEHOLD_APPLIANCE = new PublicHouseholdAppliance();
    }
    public static PublicHouseholdAppliance getPHA(){
        return PHA.PUBLIC_HOUSEHOLD_APPLIANCE;
    }
}
