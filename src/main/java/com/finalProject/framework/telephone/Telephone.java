package com.finalProject.framework.telephone;

/**
 * 手机
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:07
 */
public class Telephone {
    /**
     * 智能家电app应用
     */
    private SmartAppliancesAppFacade telephoneApp;

    public SmartAppliancesAppFacade getTelephoneApp() {
        return telephoneApp;
    }

    public void setTelephoneApp(SmartAppliancesAppFacade telephoneApp) {
        this.telephoneApp = telephoneApp;
    }
}
