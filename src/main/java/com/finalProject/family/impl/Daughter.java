package com.finalProject.family.impl;

import com.finalProject.family.Person;
import com.finalProject.telephone.Telephone;

/**
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/18 下午8:40
 */
public class Daughter implements Person{
    private Telephone telephone;

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
