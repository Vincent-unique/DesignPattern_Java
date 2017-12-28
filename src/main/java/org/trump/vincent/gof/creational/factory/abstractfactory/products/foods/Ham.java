package org.trump.vincent.gof.creational.factory.abstractfactory.products.foods;

import org.trump.vincent.gof.creational.factory.abstractfactory.exceptions.InvalidFoodException;
import org.trump.vincent.gof.creational.factory.abstractfactory.products.Food;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Ham implements Food{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Ham";

    public Ham(){
        setName("Ham");
    }
    public void saleTo()throws InvalidFoodException {
        InvalidFood [] invalidFoods = InvalidFood.values();
        for (InvalidFood invalidFood : invalidFoods){
            if(getName().equals(invalidFood)){
                throw new InvalidFoodException("["+getName()+"] is invalid Food.");
            }
        }
        System.out.printf("["+getName()+"] will sale around the China.");
    }
}
