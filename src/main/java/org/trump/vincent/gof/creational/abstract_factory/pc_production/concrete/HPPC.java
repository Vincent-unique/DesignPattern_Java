package org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete;

import org.trump.vincent.gof.creational.abstract_factory.pc_production.PCProduction;

public class HPPC extends PCProduction{
    private String name;

    public HPPC(){
        this.vendor = "HP";
        this.name = "HPPC";
    }

    public String getName() {
        return this.name;
    }
}
