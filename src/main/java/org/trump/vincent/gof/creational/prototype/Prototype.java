package org.trump.vincent.gof.creational.prototype;

import java.util.Properties;

public abstract class Prototype implements Cloneable {

    @Override
    public Prototype clone(){
        Prototype duplicate = null;
        try{
            duplicate = (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return duplicate;
    }
}
