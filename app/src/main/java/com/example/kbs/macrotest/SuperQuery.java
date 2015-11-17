package com.example.kbs.macrotest;

/**
 * Created by KBS on 2015-11-17.
 */
public abstract class SuperQuery {
    public abstract void sendQuery();
    protected String ServiceName;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public SuperQuery() {
        ServiceName = "None";
    }
}