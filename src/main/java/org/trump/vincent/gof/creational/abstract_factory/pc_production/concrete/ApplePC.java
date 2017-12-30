package org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete;

import org.trump.vincent.gof.creational.abstract_factory.pc_production.PCProduction;

public class ApplePC extends PCProduction {

    private String name;

    public ApplePC(){
        this.vendor = "Apple";
        this.name = "ApplePC";
    }
    public String getName() {
        return this.name;
    }
}
