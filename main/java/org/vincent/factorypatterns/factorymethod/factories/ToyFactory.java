package org.vincent.factorypatterns.factorymethod.factories;

import org.vincent.factorypatterns.factorymethod.AbstractProduct;
import org.vincent.factorypatterns.factorymethod.Creator;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class ToyFactory extends Creator {
    public <T extends AbstractProduct> T factory(Class<T> productClass){
        T product = null;
        try{
             product = productClass.newInstance();
//            product = (T)Class.forName(productClass.getName()).newInstance();
        }catch (IllegalAccessException e) {
            logger.error("Create Product of " + productClass + " occurs Exception", e);
        }catch (InstantiationException e){
            logger.error("Create Product of "+productClass+" occurs Exception",e);
        }
        return product;
    }
}
