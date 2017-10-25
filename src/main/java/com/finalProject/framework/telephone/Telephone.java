package com.finalProject.framework.telephone;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.bulb.Cloneable;
import org.springframework.beans.BeanUtils;

/**
 * 手机
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:07
 */
public class Telephone implements Cloneable {
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

    @Override
    public Object clone() {
        System.out.println(OutputsUtil.getOutput(this,"telephone","clone","telephone clone"));

        Telephone telephone = new Telephone();
        BeanUtils.copyProperties(this,telephone);
        return telephone;

    }
}
