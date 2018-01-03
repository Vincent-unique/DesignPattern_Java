package org.trump.vincent.gof.structural.proxy.dynamic.cglib.style1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.trump.vincent.gof.structural.proxy.dynamic.ISubject;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl1;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl2;

public class CglibApplication {

    public static void main(String[] args) {

        MethodInterceptor proxyInterceptor = new ProxyInterceptor();

        /**
         * Proxy generator for SubjectImpl1
         */
        Enhancer enhancer1 = new Enhancer();
        enhancer1.setSuperclass(SubjectImpl1.class);
        enhancer1.setCallback(proxyInterceptor);
        ISubject impl1Proxy = (ISubject) enhancer1.create();
        impl1Proxy.work();

        /**
         * Proxy generator for SubjectImpl2
         */
        Enhancer enhancer2 = new Enhancer();
        enhancer1.setSuperclass(SubjectImpl2.class);
        enhancer1.setCallback(proxyInterceptor);
        ISubject impl2Proxy = (ISubject) enhancer1.create();
        impl2Proxy.work();
    }
}
