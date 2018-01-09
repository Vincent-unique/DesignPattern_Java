package org.trump.vincent.gof.behavioral.observer;

public interface Observer {

    /**
     * Fetch or Poll the message
     */
    void update();

    void subscribe(Subject subject);

    void unSubscribe();
}
