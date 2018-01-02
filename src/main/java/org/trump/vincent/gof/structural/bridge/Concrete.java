package org.trump.vincent.gof.structural.bridge;

import org.trump.vincent.gof.structural.bridge.bridges.feature.Feature;
import org.trump.vincent.gof.structural.bridge.bridges.operation.Operation;

import java.util.Properties;

public class Concrete extends Abstract {

    public Concrete(Operation operation, Feature feature){
        super(operation,feature);
    }

    @Override
    public void work(){

        Properties features = this.feature.getFeatures();
        //TODO
        this.operation.operate();
    }
}
