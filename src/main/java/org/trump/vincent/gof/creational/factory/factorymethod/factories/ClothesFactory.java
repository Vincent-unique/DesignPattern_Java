package org.trump.vincent.gof.creational.factory.factorymethod.factories;

import org.trump.vincent.gof.creational.factory.factorymethod.AbstractProduct;
import org.trump.vincent.gof.creational.factory.factorymethod.Creator;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class ClothesFactory extends Creator {
    public <T extends AbstractProduct> T factory(Class<T> productClass){
        T product = null;
        String productName = productClass.getName();
        if(this.validateClothes(productName)){
            try {
                product = (T)Class.forName(productName).newInstance();
            }catch (IllegalAccessException e){
                logger.error("Create Product of "+productClass+" occurs Exception",e);
            }catch (ClassNotFoundException e){
                logger.error("Create Product of "+productClass+" occurs Exception",e);
            }catch (InstantiationException e){
                logger.error("Create Product of "+productClass+" occurs Exception",e);
            }
        }
        return product;
    }


    private Boolean validateClothes(String productName){
        clothesName[] clothesNames = clothesName.values();
        for(clothesName name : clothesNames){
            if(name.getName().equals(productName)){
                return true;
            }
        }
        return false;
    }
}

enum clothesName{
    shirts("SHIRTS"),
    coat("COAT"),
    trouser("TROUSER"),
    shoes("SHOES"),
    tie("TIE"),
    socks("SOCKS"),
    hat("HAT");

    String name;
    String getName(){
        return this.name;
    }
    clothesName(String name) {
        this.name = name;
    }
};