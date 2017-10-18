package com.finalProject.cooker;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:53
 */
public interface Publisher {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifys();
}
