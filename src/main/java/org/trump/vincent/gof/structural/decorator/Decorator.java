package org.trump.vincent.gof.structural.decorator;

public class Decorator implements Origin {
    private Origin origin;

    protected String info;

    public Decorator(Origin origin){
        this.origin = origin;
        this.info = "decorated once";
    }
    private void before(){
        System.out.println(this.info);
    }

    public void function() {
        this.before();
        origin.function();
    }
}
