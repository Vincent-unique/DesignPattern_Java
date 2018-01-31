package org.trump.vincent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Vincent on 2018/1/26 0026.
 */
public class ThreadBreaker {

    protected static class Handler implements Runnable{
        public void run() {
            AtomicInteger counter = new AtomicInteger(0);
            while (true){
                counter.getAndIncrement();
                if(counter.getAndIncrement()>10){
                    try {
                        throw new RuntimeException("Thread Runtime Breaker.");
                    }catch (Throwable e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Health.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Handler(),"Handle");
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(8);
            System.out.println("Handle is alive:\t" + thread.isAlive());
           /* if(!thread.isAlive()){
                thread = new Thread(new Handler(),"Handle");
                thread.start();
            }*/
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
