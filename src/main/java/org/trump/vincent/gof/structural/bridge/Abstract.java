package org.trump.vincent.gof.structural.bridge;

import org.trump.vincent.gof.structural.bridge.bridges.feature.Feature;
import org.trump.vincent.gof.structural.bridge.bridges.operation.Operation;

public abstract class Abstract {
    protected Operation operation;

    protected Feature feature;


    Abstract(Operation operation,Feature feature){
        this.operation = operation;
        this.feature = feature;
    }

    public abstract void work();
}
