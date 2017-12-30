package org.trump.vincent.gof.creational.abstract_factory;

public class FactoryCreator {

    public static
    AbstractFactory buildFactory(Class<? extends AbstractFactory> tClass){
        if(tClass==null){
            throw new NullPointerException("Null Class");
        }
        AbstractFactory factory = null;
        try {
            factory = tClass.newInstance();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }
        return factory;
    }
}
