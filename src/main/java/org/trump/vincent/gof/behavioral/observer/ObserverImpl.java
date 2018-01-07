package org.trump.vincent.gof.behavioral.observer;

public class ObserverImpl<E> implements Observer{

    private Subject<E> subject;

    private E data;

    public ObserverImpl(Subject subject){
        this.subject = subject;
    }

    public void update(){
        this.data = subject.getMessage();
    }

    public void subscribe(Subject subject) {
        if (subject!=null) {
            this.subject = subject;
            this.subject.addObserver(this);
        }
    }

    public void unSubscribe() {
        if(this.subject!=null){
            this.subject.removeObserver(this);
            this.subject = null;
        }
    }

    public Subject<E> getSubject() {
        return subject;
    }
}
