package org.trump.vincent.gof.structural.proxy.dynamic.cglib.style2;

import org.trump.vincent.gof.structural.proxy.dynamic.ISubject;
import org.trump.vincent.gof.structural.proxy.dynamic.SubjectImpl1;

public class CglibApplication {

    public static void main(String[] args) {
        CglibProxy<SubjectImpl1> CglibProxy = new CglibProxy<SubjectImpl1>(new SubjectImpl1());
        ISubject impl1Proxy = CglibProxy.createProxyObject();
        impl1Proxy.work();
    }
}
