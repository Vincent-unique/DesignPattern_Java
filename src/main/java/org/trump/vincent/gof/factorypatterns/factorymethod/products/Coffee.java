package org.trump.vincent.gof.factorypatterns.factorymethod.products;

import org.trump.vincent.gof.factorypatterns.factorymethod.AbstractProduct;
import org.trump.vincent.gof.factorypatterns.factorymethod.exceptions.InvalidProductException;

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
