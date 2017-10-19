package com.finalProject.framework.cooker;

/**
 * 消息发布者
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:53
 */
public interface Publisher {
    /**
     * 添加消息接受者
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 移除消息接受者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 消息通知
     */
    public void notifys();
}
