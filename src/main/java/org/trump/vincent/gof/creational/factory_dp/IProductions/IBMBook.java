package org.trump.vincent.gof.creational.factory_dp.IProductions;

import org.trump.vincent.gof.creational.factory_dp.Production;

public class IBMBook implements Production {
    private String name;

    public IBMBook(){
        this.name = "IBMBook";
    }

    public String getProductionName() {
        return this.name;
    }
}
