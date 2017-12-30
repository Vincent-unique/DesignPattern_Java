package org.trump.vincent.gof.creational.factory.factorymethod.core.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trump.vincent.gof.creational.factory.factorymethod.AbstractProduct;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Mobile extends AbstractProduct {
    Logger logger = LoggerFactory.getLogger(getClass());

    public Mobile(){
        setProductName("Mobile");
        setVendor("lenovo");
    }

    public void saleTo(){
        logger.info(getProductName()+" provider by "+getVendor()+" will sale around the world.");
    }

}
