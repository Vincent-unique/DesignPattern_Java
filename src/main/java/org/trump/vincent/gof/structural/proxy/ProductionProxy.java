package org.trump.vincent.gof.structural.proxy;

public class ProductionProxy implements Production{

    private Production production;

    public Production proxy(){
        this.production = new ConcreteProduction("Iphone6","Apple",6000);
        return this.production;
    }

    public String getProductionInfo(){
        return this.production==null?
                "" : this.production.getProductionInfo();
    }

    public void toMarket(){
        if(this.production!=null){
            this.production.toMarket();
        }
    }
}
