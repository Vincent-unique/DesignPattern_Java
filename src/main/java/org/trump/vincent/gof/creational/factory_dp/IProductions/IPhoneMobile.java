package org.trump.vincent.gof.creational.factory_dp.IProductions;

import org.trump.vincent.gof.creational.factory_dp.Production;

public class IPhoneMobile implements Production {

    private String name;

    public IPhoneMobile(){
        this.name = "IPhoneMobile";
    }

    public String getProductionName() {
        return this.name;
    }
}
