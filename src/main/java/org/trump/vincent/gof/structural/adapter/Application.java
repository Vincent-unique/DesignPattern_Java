package org.trump.vincent.gof.structural.adapter;

public class Application {

    public static void main(String[] args) {
        ISource source = new SourceImpl();
        source.originWork();

        ITarget target = new TargetAdapter(source).convertSource2Target();
        target.targetWork();
    }
}
