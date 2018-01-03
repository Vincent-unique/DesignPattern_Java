package org.trump.vincent.gof.structural.proxy.dynamic.jdk;

import org.trump.vincent.gof.structural.proxy.dynamic.ISubject;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl1;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl2;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {

        ProxyHandler<SubjectImpl1> impl1ProxyHandler = new ProxyHandler<SubjectImpl1>(SubjectImpl1.class);

        ISubject impl1Proxy = (ISubject) Proxy.newProxyInstance(ISubject.class.getClassLoader(),
                new Class[]{ISubject.class},impl1ProxyHandler);

        impl1Proxy.work();


        /**
         * **************************
         */

        ProxyHandler<SubjectImpl2> impl2ProxyHandler = new ProxyHandler<SubjectImpl2>(new SubjectImpl2());

        ISubject impl2Proxy = (ISubject) Proxy.newProxyInstance(ISubject.class.getClassLoader(),
                new Class[]{ISubject.class},impl2ProxyHandler);

        impl2Proxy.work();

    }
}
