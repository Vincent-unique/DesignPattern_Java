package org.trump.vincent.gof.creational.factory.factorymethod.factories;

import org.trump.vincent.gof.creational.factory.factorymethod.AbstractProduct;
import org.trump.vincent.gof.creational.factory.factorymethod.Creator;

/**
 * Created by liwei on 2017/5/23 0023.
 */
public class FoodFactory extends Creator {
    public <T extends AbstractProduct> T factory(Class<T> productClass){
         T product = null;
         try{
//             product = productClass.newInstance();
             product = (T)Class.forName(productClass.getName()).newInstance();
         }catch (IllegalAccessException e){
             logger.error("Create Product of "+productClass+" occurs Exception",e);
         }catch (ClassNotFoundException e){
             logger.error("Create Product of "+productClass+" occurs Exception",e);
         }catch (InstantiationException e){
             logger.error("Create Product of "+productClass+" occurs Exception",e);
         }
         return product;
    }

}
