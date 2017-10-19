package com.finalProject.framework.washingMachine;

/**
 * 洗衣机状态
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午9:14
 */
public interface State {
    void handle(WashingMachine washingMachine);
}
