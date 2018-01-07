package org.trump.vincent.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vincent on 2017/12/28 0028.
 */
public abstract class Subject<E>{
    protected E message;

    List<Observer> observers;

    public Subject(List<Observer> observers){
        this.observers = observers;
    }

    public int addObserver(Observer ...observers){
        if(observers!=null&&observers.length>0){
            if(this.observers==null){
                this.observers = new ArrayList<Observer>();
            }
            this.observers.addAll(Arrays.asList(observers));
            return observers.length;
        }
        return 0;
    }

    public int removeObserver(Observer observer){
        if(observer!=null){
            if(this.observers!=null){
                int index = this.observers.indexOf(observer);
                this.observers.remove(index);
                return 1;
            }
        }
        return 0;
    }

    public abstract void notifyObservers();

    public abstract void publish(E message);

    public abstract E getMessage();
}
