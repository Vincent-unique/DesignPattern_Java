package org.trump.vincent.gof.creational.abstract_factory;

import org.trump.vincent.gof.creational.abstract_factory.pc_production.PCFactory;
import org.trump.vincent.gof.creational.abstract_factory.pc_production.concrete.IBMPC;

public class Application {

    public static void main(String[] args) {
        AbstractFactory pcFactory = FactoryCreator.buildFactory(PCFactory.class);
        IBMPC ibmpc = (IBMPC) pcFactory.factory("IBMPC");
    }
}
