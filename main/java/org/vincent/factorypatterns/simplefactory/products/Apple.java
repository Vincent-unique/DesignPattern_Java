package org.vincent.factorypatterns.simplefactory.products;

import org.vincent.factorypatterns.simplefactory.AbstractProduct;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Apple extends AbstractProduct {

    public Apple(){
        this.productName = "Apple";
        this.isPlant = true;
    }

    public void grow(){
        System.out.printf("The Apple is getting growing.");
    }

    public void plant(){
        System.out.printf("The Apple is planted.");
    }

    public void harvest(){
        System.out.printf("The Apple get harveted.");
    }

}
