package com.finalProject.framework.television;

import com.finalProject.applications.OutputsUtil;

/**
 * 新版电视，接口统一
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午7:38
 */
public class NewTelevision extends Television {
    public void newInterface(){
        System.out.println(OutputsUtil.getOutput(this,"newTelevision","newInterface","watch TV"));

    }
}
