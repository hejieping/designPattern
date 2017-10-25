package com.finalProject.framework.airCondition.function.impl;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.airCondition.function.Strategy;

/**
 * 除湿功能
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午7:47
 */

public class DehumidificationStrategy implements Strategy {
    @Override
    public void useFunction() {
        System.out.println(OutputsUtil.getOutput(this,"dehumidificationStrategy","useFunction","use dehumidificationStrategy"));
    }
}
