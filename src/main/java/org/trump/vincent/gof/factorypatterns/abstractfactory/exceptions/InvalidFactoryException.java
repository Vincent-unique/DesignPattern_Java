package org.trump.vincent.gof.factorypatterns.abstractfactory.exceptions;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class InvalidFactoryException extends Exception {
    public InvalidFactoryException(String cause){
        super(cause);
    }
    public InvalidFactoryException(){

    }
}
