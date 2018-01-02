package org.trump.vincent.gof.structural.bridge;

import org.trump.vincent.gof.structural.bridge.bridges.operation.Operation;
import org.trump.vincent.gof.structural.bridge.bridges.operation.impl.OperationImpl1;
import org.trump.vincent.gof.structural.bridge.bridges.operation.impl.OperationImpl2;

public class Application {

    public static void main(String[] args) {
        Operation operation1 = new OperationImpl1();
        Abstract worker = new Concrete(operation1);
        worker.operate();


        Operation operation2 = new OperationImpl2();
        Abstract peer = new Concrete(operation2);
        peer.operate();
    }
}
