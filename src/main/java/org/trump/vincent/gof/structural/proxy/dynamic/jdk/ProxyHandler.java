package org.trump.vincent.gof.structural.proxy.dynamic.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler<T> implements InvocationHandler {

    private T impl;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public ProxyHandler(T concrete){
        this.impl = concrete;
    }

    public ProxyHandler(Class<T> tClass){
        try {
            this.impl = tClass.newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{

        preAction();

        logger.info("Invoking the method[ "+method.getName()+" ] in ProxyHandler.");
        Object result = method.invoke(impl,args);

        postAction();

        return result;
    }

    protected void preAction(){
        logger.info("ProxyHandler.preAction.");
        //TODO
    }

    protected void postAction(){
        logger.info("ProxyHandler.postAction.");
        //TODO
    }
}
