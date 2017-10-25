package com.finalProject.framework.television.decorator.impl;

import com.finalProject.applications.OutputsUtil;
import com.finalProject.framework.television.decorator.Decorator;

/**
 * 儿童模式
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:07
 */
public class ChildModeDecorator extends Decorator {
    private String feature = "child mode";
    @Override
    public void features(){
        super.features();
        System.out.println(OutputsUtil.getOutput(this,"childModeDecorator","television feature","game feature"));
    }
}
