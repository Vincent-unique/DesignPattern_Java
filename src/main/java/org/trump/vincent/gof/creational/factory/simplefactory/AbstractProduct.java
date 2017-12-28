package org.trump.vincent.gof.creational.factory.simplefactory;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public abstract class AbstractProduct {

    public abstract void grow();
    public abstract void plant();
    public abstract void harvest();

    public String productName = null;
    public boolean isPlant = false;

}
