package org.trump.vincent.gof.structural.proxy;

import com.google.gson.Gson;

public class ConcreteProduction implements Production {

    private String name;
    private String vendor;
    private Integer price;

    public ConcreteProduction(String name,String vendor,int price){
        this.name = name;
        this.vendor = vendor;
        this.price = price;
    }

    public String getProductionInfo() {
        return new Gson().toJson(this);
    }

    public void toMarket(){
        System.out.println(this.name+" is being to the Market.");
    }

    public String getName() {
        return name;
    }

    public ConcreteProduction setName(String name) {
        this.name = name;
        return this;
    }

    public String getVendor() {
        return vendor;
    }

    public ConcreteProduction setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public ConcreteProduction setPrice(Integer price) {
        this.price = price;
        return this;
    }


}
