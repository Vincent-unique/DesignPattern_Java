package org.trump.vincent.gof.creational.abstract_factory.phone_production;

import org.trump.vincent.gof.creational.abstract_factory.AbstractFactory;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.PCProduction;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.ApplePC;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.HPPC;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.IBMPC;
import org.trump.vincent.gof.creational.abstract_factory.phone_production.concrete.ApplePhone;
import org.trump.vincent.gof.creational.abstract_factory.phone_production.concrete.NokiaPhone;

public class PhoneFactory implements AbstractFactory {

    @Override
    public PhoneProduction factory(String phoneName){
        if("ApplePhone".equalsIgnoreCase(phoneName)){
            return new ApplePhone();
        }else if ("NokiaPhone".equalsIgnoreCase(phoneName)) {
            return new NokiaPhone();
        }
        return null;
    }
    @Override
    public String getFactoryType() {
        return Factory.PHONE_FACTORY.getName();
    }
}
