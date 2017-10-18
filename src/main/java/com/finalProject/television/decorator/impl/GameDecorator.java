package com.finalProject.television.decorator.impl;

import com.finalProject.television.decorator.Decorator;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:09
 */
public class GameDecorator extends Decorator {
    private String feature = "game mode";
    @Override
    public void features(){
        super.features();
        System.out.print(feature + " ");
    }
}
