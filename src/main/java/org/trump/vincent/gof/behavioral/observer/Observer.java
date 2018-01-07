package org.trump.vincent.gof.behavioral.observer;

public interface Observer {

    void update();

    void subscribe(Subject subject);

    void unSubscribe();
}
