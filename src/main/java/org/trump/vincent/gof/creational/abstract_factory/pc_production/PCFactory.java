package org.trump.vincent.gof.creational.abstract_factory.pc_production;

import org.trump.vincent.gof.creational.abstract_factory.AbstractFactory;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.ApplePC;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.HPPC;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.IBMPC;

public class PCFactory implements AbstractFactory {

    @Override
    public PCProduction factory(String pcName){
        if("ApplePC".equalsIgnoreCase(pcName)){
            return new ApplePC();
        }else if ("HPPC".equalsIgnoreCase(pcName)){
            return new HPPC();
        }else if("IBMPC".equalsIgnoreCase(pcName)){
            return new IBMPC();
        }
        return null;
    }

    @Override
    public String getFactoryType() {
        return Factory.PC_FACTORY.getName();
    }
}
