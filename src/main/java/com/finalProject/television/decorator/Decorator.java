package com.finalProject.television.decorator;

import com.finalProject.television.Television;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:11
 */
public  class Decorator extends Television {
    protected Television television;
    public void setTelevision(Television television){
        this.television = television;
    }
    @Override
    public void features(){
        if(television != null){
            television.features();
        }
    }
}
