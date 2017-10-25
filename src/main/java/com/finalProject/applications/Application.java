package com.finalProject.applications;

import com.finalProject.framework.PublicHouseholdAppliance;
import com.finalProject.framework.airCondition.AirCondition;
import com.finalProject.framework.bulb.Bulb;
import com.finalProject.framework.cooker.Cooker;
import com.finalProject.framework.cooker.CookerInvoker;
import com.finalProject.framework.cooker.PorridgeCommand;
import com.finalProject.framework.cooker.RiceCommand;
import com.finalProject.framework.cooker.SoupCommand;
import com.finalProject.framework.family.Person;
import com.finalProject.framework.family.impl.Daughter;
import com.finalProject.framework.family.impl.Father;
import com.finalProject.framework.family.impl.Mother;
import com.finalProject.framework.family.impl.Son;
import com.finalProject.framework.telephone.SmartAppliancesAppFacade;
import com.finalProject.framework.telephone.Telephone;
import com.finalProject.framework.television.NewTelevision;
import com.finalProject.framework.television.decorator.impl.ChildModeDecorator;
import com.finalProject.framework.television.decorator.impl.GameDecorator;
import com.finalProject.framework.television.decorator.impl.VoiceDecorator;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:40
 */
public class Application {
    public static void main(String[] args){
        //手机和角色初始化
        Telephone fatherTelephone = new Telephone();
        //克隆模式
        Telephone motherTelephone = (Telephone)fatherTelephone.clone();
        Telephone sonTelephone = (Telephone)fatherTelephone.clone();
        Telephone daughtTelePhone = (Telephone)fatherTelephone.clone();
        initSmartAppliancesAppFacade(fatherTelephone);
        initSmartAppliancesAppFacade(motherTelephone);
        initSmartAppliancesAppFacade(sonTelephone);
        initSmartAppliancesAppFacade(daughtTelePhone);
        Person father = new Father();
        Person mother = new Mother();
        Person son = new Son();
        Person daughter = new Daughter();
        father.setTelephone(fatherTelephone);
        mother.setTelephone(motherTelephone);
        son.setTelephone(sonTelephone);
        daughter.setTelephone(daughtTelePhone);

        //设置个人私有空调
        AirCondition sonAircondition = new AirCondition();
        sonAircondition.setLocation(Constants.LOCATION_BEDROOM);
        AirCondition daughterAirCondition = (AirCondition)sonAircondition.clone();
        AirCondition parentAircondition = (AirCondition)sonAircondition.clone();
        father.getTelephone().getTelephoneApp().getAirConditionProxy().setAirCondition(parentAircondition);
        mother.getTelephone().getTelephoneApp().getAirConditionProxy().setAirCondition(parentAircondition);
        son.getTelephone().getTelephoneApp().getAirConditionProxy().setAirCondition(sonAircondition);
        daughter.getTelephone().getTelephoneApp().getAirConditionProxy().setAirCondition(daughterAirCondition);
        //使用旧空调看电视
        father.getTelephone().getTelephoneApp().getTelevisionProxy().on();
        //代理模式
        father.getTelephone().getTelephoneApp().getTelevisionProxy().features();
        father.getTelephone().getTelephoneApp().getTelevisionProxy().off();
        //换成新电视
        father.getTelephone().getTelephoneApp().getTelevisionProxy().setTelevision(new NewTelevision());
        //增加电视功能
        father.getTelephone().getTelephoneApp().getTelevisionProxy().features();
        //装饰模式
        ChildModeDecorator childModeDecorator = new ChildModeDecorator();
        GameDecorator gameDecorator = new GameDecorator();
        VoiceDecorator voiceDecorator = new VoiceDecorator();
        childModeDecorator.setTelevision(father.getTelephone().getTelephoneApp().getTelevisionProxy().getTelevision());
        gameDecorator.setTelevision(childModeDecorator);
        voiceDecorator.setTelevision(gameDecorator);
        father.getTelephone().getTelephoneApp().getTelevisionProxy().setTelevision(voiceDecorator);
        father.getTelephone().getTelephoneApp().getTelevisionProxy().features();

        //使用空调
        father.getTelephone().getTelephoneApp().getAirConditionProxy().useFunction(Constants.LOCATION_HALL);
        son.getTelephone().getTelephoneApp().getAirConditionProxy().useFunction(Constants.LOCATION_BEDROOM);
        //关灯
        father.getTelephone().getTelephoneApp().getBulbProxy().turnOffBulb(Constants.LOCATION_HALL);

        Cooker cooker = new Cooker();
        //观察者模式
        //添加消息订阅者
        cooker.attach(father.getTelephone().getTelephoneApp());
        cooker.attach(mother.getTelephone().getTelephoneApp());
        cooker.attach(son.getTelephone().getTelephoneApp());
        cooker.attach(daughter.getTelephone().getTelephoneApp());
        //全家共用一个电饭煲
        CookerInvoker cookerInvoker = father.getTelephone().getTelephoneApp().getCookerInvoker();
        mother.getTelephone().getTelephoneApp().setCookerInvoker(cookerInvoker);
        son.getTelephone().getTelephoneApp().setCookerInvoker(cookerInvoker);
        daughter.getTelephone().getTelephoneApp().setCookerInvoker(cookerInvoker);
        //命令模式
        PorridgeCommand porridgeCommand = new PorridgeCommand(cooker);
        RiceCommand riceCommand = new RiceCommand(cooker);
        SoupCommand soupCommand = new SoupCommand(cooker);
        father.getTelephone().getTelephoneApp().getCookerInvoker().setCommand(porridgeCommand);
        son.getTelephone().getTelephoneApp().getCookerInvoker().setCommand(riceCommand);
        daughter.getTelephone().getTelephoneApp().getCookerInvoker().setCommand(soupCommand);
        //通知电饭煲执行命令
        father.getTelephone().getTelephoneApp().getCookerInvoker().notifyCooker();

        //洗衣服
        mother.getTelephone().getTelephoneApp().getWashingMachineProxy().washCloth();

    }

    /**
     * 安装手机智能家电APP
     * @param telephone
     */
    public static void initSmartAppliancesAppFacade(Telephone telephone){
        //外观模式
        SmartAppliancesAppFacade telePhoneApp = new SmartAppliancesAppFacade();
        initPHA(telePhoneApp);
        telephone.setTelephoneApp(telePhoneApp);
    }

    /**
     * 公共家电初始化，并绑定手机APP
     * @param smartAppliancesAppFacade
     */
    private static void initPHA(SmartAppliancesAppFacade smartAppliancesAppFacade){
        //单例模式
        PublicHouseholdAppliance pha = PublicHouseholdAppliance.getPHA();
        smartAppliancesAppFacade.getTelevisionProxy().setTelevision(pha.getOldTelevision());
        smartAppliancesAppFacade.getWashingMachineProxy().setWashingMachine(pha.getWashingMachine());
        smartAppliancesAppFacade.setCookerInvoker(pha.getCookerInvoker());
        smartAppliancesAppFacade.getAirConditionProxy().setAirCondition(pha.getAirCondition());
        for(Bulb bulb : pha.getBulbList()){
            smartAppliancesAppFacade.getBulbProxy().addBulb(bulb);
        }

    }

}
