package org.vincent.factorypatterns.simplefactory.products;

import org.vincent.factorypatterns.simplefactory.AbstractProduct;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Strawberry extends AbstractProduct {
    public Strawberry(){
        this.productName = "Strawberry";
        this.isPlant = true;
    }

    public void grow(){
        System.out.printf("The Strawberry is getting growing.");
    }

    public void plant(){
        System.out.printf("The Strawberry is planted.");
    }

    public void harvest(){
        System.out.printf("The Strawberry get harveted.");
    }
}
