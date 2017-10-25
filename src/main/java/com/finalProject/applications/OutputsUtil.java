package com.finalProject.applications;

import com.google.common.base.Joiner;

/**
 * 输出格式
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/19 下午8:58
 */
public class OutputsUtil {
    public static String getOutput(Object object,String objectName,String methodName,String description){
        String[] outputs = new String[]{object.getClass().getSimpleName(),objectName,methodName,description};
        return Joiner.on(Constants.SPLIT_CHAR).join(outputs);
    }
}
