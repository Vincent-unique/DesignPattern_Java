package org.trump.vincent.gof.creational.singleton;

/**
 * Created by Vincent on 2018/1/22 0022.
 */
public class InnerSingleton {

    private static class Inner{
        private static InnerSingleton instance = new InnerSingleton();
    }

    private InnerSingleton(){
        System.out.println("Initialize Loading.");
    }

    public static InnerSingleton getInstance(){
        return Inner.instance;
    }

    public static void main(String[] args) {
        InnerSingleton.getInstance();
    }
}
