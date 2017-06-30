package org.vincent.factorypatterns.factorymethod.products;

import org.vincent.factorypatterns.factorymethod.AbstractProduct;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Mobile extends AbstractProduct{

    public Mobile(){
        setProductName("Mobile");
        setVendor("lenovo");
    }

    public void saleTo(){
        logger.info(getProductName()+" provider by "+getVendor()+" will sale around the world.");
    }

}
