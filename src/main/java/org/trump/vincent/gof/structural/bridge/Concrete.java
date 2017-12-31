package org.trump.vincent.gof.structural.bridge;

public class Concrete extends Abstract {

    public Concrete(Operation operation){
        super(operation);
    }

    @Override
    public void operate(){
        this.operation.operate();
    }
}
