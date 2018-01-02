package org.trump.vincent.gof.structural.bridge;

import org.trump.vincent.gof.structural.bridge.bridges.feature.Feature;
import org.trump.vincent.gof.structural.bridge.bridges.feature.impl.FeatureImpl1;
import org.trump.vincent.gof.structural.bridge.bridges.feature.impl.FeatureImpl2;
import org.trump.vincent.gof.structural.bridge.bridges.operation.Operation;
import org.trump.vincent.gof.structural.bridge.bridges.operation.impl.OperationImpl1;
import org.trump.vincent.gof.structural.bridge.bridges.operation.impl.OperationImpl2;

import java.util.Properties;

public class Application {

    public static void main(String[] args) {
        Operation operation1 = new OperationImpl1();
        Feature feature1 = new FeatureImpl1(new Properties());
        Abstract worker = new Concrete(operation1,feature1);
        worker.work();


        Operation operation2 = new OperationImpl2();
        Feature feature2 = new FeatureImpl2(null);
        Abstract peer = new Concrete(operation2,feature2);
        peer.work();
    }
}
