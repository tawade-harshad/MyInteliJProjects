package com.training.beans;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CDIQualifierApplication {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        DonorManager donorMgr = container.instance().select(DonorManager.class).get();
        System.out.println("List of Blood Donors :");
        for (String eachDonor:donorMgr.getBloodDonors()) {
            System.out.println(eachDonor);
        }
        System.out.println("*******************************");

        System.out.println("List of All Donors :");
        for (String eachDonor:donorMgr.getAllDonors()) {
            System.out.println(eachDonor);
        }
    }
}
