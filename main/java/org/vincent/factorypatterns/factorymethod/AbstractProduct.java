package org.vincent.factorypatterns.factorymethod;

import org.vincent.factorypatterns.factorymethod.exceptions.InvalidProductException;
import org.vincent.util.LoggerUtil;

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
