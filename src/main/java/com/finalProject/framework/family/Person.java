package com.finalProject.framework.family;

import com.finalProject.framework.telephone.Telephone;

/**
 * 人类
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:39
 */
public interface Person {
    Telephone getTelephone();
    void setTelephone(Telephone telephone);
}
