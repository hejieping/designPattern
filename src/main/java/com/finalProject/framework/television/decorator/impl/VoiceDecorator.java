package com.finalProject.framework.television.decorator.impl;

import com.finalProject.framework.television.decorator.Decorator;

/**
 * 语音功能
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:06
 */
public class VoiceDecorator extends Decorator{
    private String feature = "smart voice";
    @Override
    public void features(){
        super.features();
        System.out.print(feature + " ");
    }
}
