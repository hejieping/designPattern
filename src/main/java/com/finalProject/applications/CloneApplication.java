package com.finalProject.applications;

import com.finalProject.framework.bulb.Bulb;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:40
 */
public class CloneApplication {
    public static void main(String[] args){
        Bulb hallBulb = new Bulb();
        hallBulb.setPower("100W");
        hallBulb.setPower("大厅");

        Bulb bedRoomBulb = hallBulb.clone();
        System.out.println(outputsUtil.getOutput(hallBulb,"hallBulb","clone","I'm cloned"));
        bedRoomBulb.setLocation("卧室");
        Bulb restRoomBulb = hallBulb.clone();
        System.out.println(outputsUtil.getOutput(hallBulb,"hallBulb","clone","I'm cloned"));
        restRoomBulb.setLocation("厕所");
    }

}
