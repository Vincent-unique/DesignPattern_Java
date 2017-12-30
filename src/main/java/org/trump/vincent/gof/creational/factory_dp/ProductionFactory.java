package org.trump.vincent.gof.creational.factory_dp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductionFactory {

    private Logger logger = LoggerFactory.getLogger(getClass());
    public <T extends Production> Production factory(Class<T> tClass){

        if(tClass==null){
            throw new NullPointerException("Null Production Class.");
        }
        Production production = null;
        try {
            production = tClass.newInstance();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }
        return production;
    }

    public Production factory(String productionClassName){
        Class productionClass = null;
        try {
            productionClass = Class.forName(productionClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return factory(productionClass);
    }
}
