package com.finalProject.framework.family.impl;

import com.finalProject.framework.family.Person;
import com.finalProject.framework.telephone.Telephone;

/**
 * 爸爸
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:39
 */
public class Father implements Person{
    private Telephone telephone;
    @Override
    public Telephone getTelephone() {
        return telephone;
    }
    @Override
    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
