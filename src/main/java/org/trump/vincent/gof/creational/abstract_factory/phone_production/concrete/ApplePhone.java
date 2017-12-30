package org.trump.vincent.gof.creational.abstract_factory.phone_production.concrete;

import org.trump.vincent.gof.creational.abstract_factory.phone_production.PhoneProduction;

public class ApplePhone extends PhoneProduction {

    private String name;

    private String vendor;

    public ApplePhone(){
        this.vendor = "Apple";
        this.name = "ApplePhone";
    }

    public String getName() {
        return this.name;
    }

    public String getVendor() {
        return this.vendor;
    }
}
