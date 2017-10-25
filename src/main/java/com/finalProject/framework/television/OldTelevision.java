package com.finalProject.framework.television;

import com.finalProject.applications.OutputsUtil;

/**
 * 老电视，没有统一接口，需要调用指定接口
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午7:37
 */
public class OldTelevision extends Television {
    public void oldInterface(){
        System.out.println(OutputsUtil.getOutput(this,"oldTelevision","oldInterface","watch TV"));
    }
}
