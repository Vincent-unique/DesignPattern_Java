package org.trump.vincent.gof.structural.decorator;

public class DoubleDecorator extends Decorator {

    protected Origin decorator;

    protected String vendor;

    public DoubleDecorator(Origin decorator){
        super(decorator);
        this.vendor = "Apple";
    }

    protected void showVD(){
        System.out.println(this.vendor);
    }

    @Override
    public void function(){
        this.showVD();
        super.function();
    }
}
