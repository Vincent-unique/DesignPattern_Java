package org.vincent.factorypatterns.factorymethod.products;

import org.vincent.factorypatterns.factorymethod.AbstractProduct;
import org.vincent.factorypatterns.factorymethod.exceptions.InvalidProductException;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Heroin extends AbstractProduct {

    public Heroin(){
        setProductName("Heroin");
        setVendor("####");
    }
    public void saleTo() throws InvalidProductException{
        throw new InvalidProductException("Heroin is Invalid saling goods");
    }
}
