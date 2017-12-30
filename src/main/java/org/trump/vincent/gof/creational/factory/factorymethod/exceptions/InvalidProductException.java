package org.trump.vincent.gof.creational.factory.factorymethod.exceptions;

/**
 * Created by Vincent on 2017/5/22 0022.
 */
public class InvalidProductException extends BadProductException {
    public InvalidProductException(String msg){
        super(msg);
    }
}
