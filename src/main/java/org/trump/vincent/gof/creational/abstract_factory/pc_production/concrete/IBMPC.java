package org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete;

import org.trump.vincent.gof.creational.abstract_factory.pc_production.PCProduction;

public class IBMPC extends PCProduction{

    private String name;

    public IBMPC(){
        this.vendor = "IBM";
        this.name = "IBMPC";
    }

    public String getName() {
        return this.name;
    }
}
