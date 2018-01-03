package org.trump.vincent.gof.structural.decorator;

/**
 * Created by Vincent on 2018/1/2 0002.
 */
public class TripleDecorator extends DoubleDecorator {

    protected String toCountry;

    public TripleDecorator(Origin doubleDecorator){
        super(doubleDecorator);
        this.info = "Decorate triple";
        this.toCountry = "China";
    }

    @Override
    public void function() {
        super.function();
        this.saleTo();
    }

    protected void saleTo(){
        System.out.println("The production will sale to "+this.toCountry);
    }
}
