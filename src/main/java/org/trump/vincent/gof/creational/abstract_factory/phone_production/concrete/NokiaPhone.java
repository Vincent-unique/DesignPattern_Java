package org.trump.vincent.gof.creational.abstract_factory.phone_production.concrete;

import org.trump.vincent.gof.creational.abstract_factory.phone_production.PhoneProduction;

public class NokiaPhone extends PhoneProduction {

    private String name;
    private String vendor;

    public NokiaPhone(){
        this.vendor = "Nokia";
        this.name = "NokiaPhone";
    }

    public String getName() {
        return this.name;
    }

    public String getVendor() {
        return this.vendor;
    }
}
