package com.finalProject.framework.television;

import com.finalProject.applications.OutputsUtil;

/**
 * 电视使用适配器，用于老电视接口不兼容使用
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午7:57
 */
public class NewTelevisionAdapter extends NewTelevision {
    private OldTelevision oldTelevision = new OldTelevision();
    @Override
    public void newInterface(){
        System.out.println(OutputsUtil.getOutput(this,"newTelevisionAdapter","newInterface","watch TV"));

        oldTelevision.oldInterface();
    }
}
