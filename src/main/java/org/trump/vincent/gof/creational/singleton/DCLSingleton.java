package org.trump.vincent.gof.creational.singleton;

public class DCLSingleton {
    private static volatile DCLSingleton instance;

    private DCLSingleton(){
        //TODO
    }

    public static DCLSingleton getInstance() {
        if(instance==null){
            synchronized (DCLSingleton.class){
                if(instance==null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
