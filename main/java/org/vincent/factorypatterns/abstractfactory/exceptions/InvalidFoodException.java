package org.vincent.factorypatterns.abstractfactory.exceptions;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class InvalidFoodException extends InvalidProductException {
    public InvalidFoodException(String cause){
        super(cause);
    }
}
