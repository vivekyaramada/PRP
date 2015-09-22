package com.gdit.entity;


import java.util.ArrayList;


public class ApplicationTableEntity {
    public ApplicationTableEntity() {
    }

    public ArrayList getApplications() {
        ArrayList applications = new ArrayList();
        applications.add(new ApplicationsEntity("SYSTEM1", "PAYMENT1", "", "1.00", "01/01/2009", "12/12/2009"));
        applications.add(new ApplicationsEntity("SYSTEM2", "PAYMENT2", "", "2.00", "01/01/2010", "12/12/2010"));
        applications.add(new ApplicationsEntity("SYSTEM3", "PAYMENT3", "", "3.00", "01/01/2011", "12/12/2011"));
        applications.add(new ApplicationsEntity("SYSTEM4", "PAYMENT4", "", "4.00", "01/01/2012", "12/12/2012"));
        applications.add(new ApplicationsEntity("SYSTEM5", "PAYMENT5", "", "5.00", "01/01/2013", "12/12/2013"));
        applications.add(new ApplicationsEntity("SYSTEM6", "PAYMENT8", "", "6.00", "01/01/2014", "12/12/2014"));
        applications.add(new ApplicationsEntity("SYSTEM2", "PAYMENT3", "", "1.00", "01/01/2009", "12/12/2009"));
        applications.add(new ApplicationsEntity("SYSTEM2", "PAYMENT3", "", "2.00", "01/01/2010", "12/12/2010"));
        applications.add(new ApplicationsEntity("SYSTEM4", "PAYMENT6", "", "2.00", "01/01/2011", "12/12/2011"));
        applications.add(new ApplicationsEntity("SYSTEM4", "PAYMENT6", "", "4.00", "01/01/2012", "12/12/2012"));
        applications.add(new ApplicationsEntity("SYSTEM6", "PAYMENT5", "", "2.00", "01/01/2013", "12/12/2013"));
        applications.add(new ApplicationsEntity("SYSTEM6", "PAYMENT5", "", "6.00", "01/01/2014", "12/12/2014"));
        return applications;
    }
}
