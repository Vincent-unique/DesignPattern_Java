package org.trump.vincent.gof.structural.decorator;

public class DoubleDecorator extends Decorator {

    private Origin origin;

    private String vendor;

    public DoubleDecorator(Origin origin){
        super(origin);
        this.vendor = "Apple";
    }

    public void showVD(){
        System.out.println(this.vendor);
    }

    @Override
    public void work(){
        this.showVD();
        super.work();
    }
}
