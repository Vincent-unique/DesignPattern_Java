package org.trump.vincent.gof.creational.factory_dp.IProductions;

import org.trump.vincent.gof.creational.factory_dp.Production;

public class MacBook implements Production {
    private String name;

    public MacBook(){
        this.name = "MacBook";
    }
    public String getProductionName() {
        return this.name;
    }
}
