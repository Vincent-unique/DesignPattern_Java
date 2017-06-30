package org.vincent.factorypatterns.factorymethod.exceptions;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class InvalidProductException extends BadProductException {
    public InvalidProductException(String msg){
        super(msg);
    }
}
