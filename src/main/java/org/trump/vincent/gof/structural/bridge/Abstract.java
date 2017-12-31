package org.trump.vincent.gof.structural.bridge;

public abstract class Abstract {
    protected Operation operation;

    Abstract(Operation operation){
        this.operation = operation;
    }

    public abstract void operate();
}
