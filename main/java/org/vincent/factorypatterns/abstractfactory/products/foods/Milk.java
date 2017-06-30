package org.vincent.factorypatterns.abstractfactory.products.foods;

import org.vincent.factorypatterns.abstractfactory.products.Food;
import org.vincent.factorypatterns.abstractfactory.exceptions.InvalidFoodException;

/**
 * Created by liwei on 2017/5/23 0023.
 */
public class Milk implements Food {
    public String getName() {
        return name;
    }

    String name ="Milk";

    public Milk(){
        this.name = "Milk";
    }
    public void saleTo()throws InvalidFoodException{
        InvalidFood [] invalidFoods = InvalidFood.values();
        for (InvalidFood invalidFood : invalidFoods){
            if(getName().equals(invalidFood)){
                throw new InvalidFoodException("["+getName()+"] is invalid Food.");
            }
        }
        System.out.printf("["+getName()+"] will sale around the world.");
    }
}
