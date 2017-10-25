package com.finalProject.framework.bulb;

import java.util.Map;

import com.finalProject.applications.OutputsUtil;
import com.google.common.collect.Maps;

/**
 * 电灯代理类
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:36
 */
public class BulbProxy {
    /**
     * 代理类控制多个电灯
     */
    private Map<String,Bulb> bulbMap = Maps.newHashMap();
    public void addBulb(Bulb bulb){
        bulbMap.put(bulb.getLocation(),bulb);
    }
    public void removeBulb(Bulb bulb){
        bulbMap.remove(bulb.getLocation());
    }

    /**
     * 开灯
     * @param location
     */
    public void turnOnBulb(String location){
        System.out.println(OutputsUtil.getOutput(this,"bulbProxy","turnOnBulb","turn on "+location+" bulb"));
        bulbMap.get(location).on();
    }

    /**
     * 关灯
     * @param location
     */
    public void turnOffBulb(String location){
        System.out.println(OutputsUtil.getOutput(this,"bulbProxy","turnOffBulb","turn off "+location+" bulb"));

        bulbMap.get(location).off();
    }
}
