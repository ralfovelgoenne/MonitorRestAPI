package com.rov.mra;

import java.io.Serializable;
import java.util.HashMap;

public class HealthcheckDO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Boolean systemfunctionCheck;
    private String interfacename;
    //private HashMap interfaces;

    public HealthcheckDO() {
    }

    public HealthcheckDO(boolean systemfunctionCheck, String interfacename) {
        this.systemfunctionCheck = systemfunctionCheck;
        this.interfacename = interfacename;
    }

    public Boolean isSystemfunctionCheck() {
        return systemfunctionCheck;
    }

    public void setSystemfunctionCheck(Boolean systemfunctionCheck) {

        this.systemfunctionCheck = systemfunctionCheck;
    }

    /*public HashMap getInterfaces() {

        return interfaces;
    }

    public void setInterfaces(HashMap interfaces) {

        this.interfaces = interfaces;
    }*/

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.isSystemfunctionCheck())
                .toString();
    }
}
