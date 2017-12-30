package org.trump.vincent.gof.creational.factory.factorymethod.core.products;

import org.trump.vincent.gof.creational.factory.factorymethod.AbstractProduct;
import org.trump.vincent.gof.creational.factory.factorymethod.exceptions.InvalidProductException;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Coffee extends AbstractProduct {

    public Coffee(){
        setProductName("Coffee");
        setVendor("nestle");
    }

    public void saleTo() throws InvalidProductException {
        logger.info(getProductName()+" provider by "+getVendor()+" will sale around the world.");
    }
}