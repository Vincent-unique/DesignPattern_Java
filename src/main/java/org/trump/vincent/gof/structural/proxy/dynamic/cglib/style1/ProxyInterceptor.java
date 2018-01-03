package org.trump.vincent.gof.structural.proxy.dynamic.cglib.style1;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyInterceptor<T> implements MethodInterceptor {

//    private T target;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public Object intercept(Object obj, java.lang.reflect.Method method, Object[] args,
                            MethodProxy proxy) throws Throwable{

        preAction();

        logger.info("Invoking the method[ "+method.getName()+" ] in ProxyInterceptor.");
        Object result = proxy.invokeSuper(obj,args);

        postAction();

        return result;
    }

    protected void preAction(){
        logger.info("ProxyInterceptor.preAction.");
        //TODO
    }

    protected void postAction(){
        logger.info("ProxyInterceptor.postAction.");
        //TODO
    }
}
