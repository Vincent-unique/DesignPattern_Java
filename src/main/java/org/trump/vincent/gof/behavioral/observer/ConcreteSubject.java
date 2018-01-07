package org.trump.vincent.gof.behavioral.observer;

import java.util.List;

public class ConcreteSubject<E> extends Subject<E> {

    public ConcreteSubject(List<Observer> observers){
        super(observers);
    }

    @Override
    public void notifyObservers() {
        if(this.observers!=null && this.observers.size()>0){
            for (Observer observer : this.observers){
                observer.update();
            }
        }
    }

    @Override
    public void publish(E message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public E getMessage() {
        return this.message;
    }
}
