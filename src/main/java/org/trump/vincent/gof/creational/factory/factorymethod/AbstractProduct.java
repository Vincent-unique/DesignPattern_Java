package org.trump.vincent.gof.creational.factory.factorymethod;

import org.trump.vincent.gof.creational.factory.factorymethod.exceptions.InvalidProductException;
import org.trump.vincent.util.LoggerUtil;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public abstract class AbstractProduct extends LoggerUtil {
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String vendor = null;
    public String productName = null;

    public abstract void saleTo() throws InvalidProductException;
}
