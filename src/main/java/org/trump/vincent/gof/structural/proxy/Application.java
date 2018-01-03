package org.trump.vincent.gof.structural.proxy;

import org.trump.vincent.gof.structural.proxy.core.Production;
import org.trump.vincent.gof.structural.proxy.core.ProductionProxy;

public class Application {

    public static void main(String[] args) {
        Production production = new ProductionProxy();
        production.getProductionInfo();
        production.toMarket();
    }
}
