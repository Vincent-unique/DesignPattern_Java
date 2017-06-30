package org.vincent.factorypatterns.abstractfactory.factories;

import org.vincent.factorypatterns.abstractfactory.AbstractFactory;
import org.vincent.factorypatterns.abstractfactory.exceptions.InvalidFactoryException;
import org.vincent.factorypatterns.abstractfactory.products.Food;

/**
 * Created by liwei on 2017/5/23 0023.
 */
public class FoodFactory extends AbstractFactory {
    public FoodFactory(){
        setFactoryName("FoodFactory");
    }

    public Food factoryFood(String productName) throws InvalidFactoryException{
        if(null == productName){
            return null;
        }
        if (!validateSupportCreat(productName)){
            throw new InvalidFactoryException("FoodFactory Not Support to Create ["+productName+"].");
        }
        try {
            java.lang.Class productClass = Class.forName(productName);
            if(productClass!=null){
                return (Food) productClass.newInstance();
            }
        }catch (ClassNotFoundException e){
            throw new InvalidFactoryException("FoodFactory Not Support to Create ["+productName+"].");
        }catch (IllegalAccessException e){
            throw new InvalidFactoryException("FoodFactory Not Support to Create ["+productName+"].");
        }catch (InstantiationException e){
            throw new InvalidFactoryException("FoodFactory Not Support to Create ["+productName+"].");
        }
        return null;
    }

    private Boolean validateSupportCreat(String productName){
        SupportCreat [] supportCreats = SupportCreat.values();
        for (SupportCreat supportCreat : supportCreats){
            if(productName.equals(supportCreat))
                return true;
        }
        return false;
    }

    enum SupportCreat{
        Rice("Rice"),
        Milk("Milk"),
        Ham("Ham"),
        Juice("Juice")
        ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        SupportCreat(String name){
            setName(name);
        }
    }
}
