package org.trump.vincent.gof.factorypatterns.factorymethod.products;

import org.trump.vincent.gof.factorypatterns.factorymethod.AbstractProduct;
import org.trump.vincent.gof.factorypatterns.factorymethod.exceptions.InvalidProductException;

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
