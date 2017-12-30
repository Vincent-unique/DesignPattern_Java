package org.trump.vincent.gof.creational.abstract_factory.phone_production;

import org.trump.vincent.gof.creational.abstract_factory.Production;

public abstract class PhoneProduction implements Production{

     public String info(){
         return "ProductionName:\t"+getName()+"\n" +
                 "ProductionVendor:\t"+getVendor();
     }
}
