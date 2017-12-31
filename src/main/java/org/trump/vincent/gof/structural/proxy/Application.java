package org.trump.vincent.gof.structural.proxy;

public class Application {

    public static void main(String[] args) {
        Production production = new ProductionProxy();
        production.getProductionInfo();
        production.toMarket();
    }
}
