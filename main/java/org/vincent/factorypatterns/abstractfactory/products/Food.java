package org.vincent.factorypatterns.abstractfactory.products;

import org.vincent.factorypatterns.abstractfactory.exceptions.InvalidFoodException;

/**
 * Created by liwei on 2017/5/23 0023.
 */
public interface Food {
    public void saleTo()throws InvalidFoodException;

    enum InvalidFood{
        DirtyOil("DirtyOil"),//地沟油
        BearPaw("BearPaw"), //保护动物
        HumanBeings("HumanBeings"),
        ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        InvalidFood(String name){
            setName(name);
        }

    }
}

