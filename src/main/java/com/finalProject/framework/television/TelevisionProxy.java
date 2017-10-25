package com.finalProject.framework.television;

import com.finalProject.applications.OutputsUtil;

/**
 * 电视代理类
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:38
 */
public class TelevisionProxy extends Television{
    private Television television;
    @Override
    public void features(){
        System.out.println(OutputsUtil.getOutput(this,"televisionProxy","features","TV features"));
        television.features();
    }
    public void newInterface(){}
    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
}
