package org.trump.vincent.gof.creational.abstract_factory.pc_production;

import org.trump.vincent.gof.creational.abstract_factory.Production;

public abstract class PCProduction implements Production {

    protected String vendor;

    public String getVendor() {
        return this.vendor;
    }
}
