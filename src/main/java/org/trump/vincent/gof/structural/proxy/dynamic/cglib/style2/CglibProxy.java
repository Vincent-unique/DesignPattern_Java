package org.trump.vincent.gof.structural.proxy.dynamic.cglib.style2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trump.vincent.gof.structural.proxy.dynamic.ISubject;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl1;

public class CglibProxy<T> implements MethodInterceptor {

    private T proxyTarget;

    public CglibProxy(T proxyTarget){
        this.proxyTarget = proxyTarget;
    }

    public T createProxyObject(){
        Enhancer enhancer1 = new Enhancer();
        enhancer1.setSuperclass(this.proxyTarget.getClass());
        enhancer1.setCallback(this);
        T implProxy = (T) enhancer1.create();
        return implProxy;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

    public Object intercept(Object obj, java.lang.reflect.Method method, Object[] args,
                            MethodProxy proxy) throws Throwable{

        preAction();

        logger.info("Invoking the method[ "+method.getName()+" ] in ProxyInterceptor.");
        Object result = method.invoke(this.proxyTarget,args) ;

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
