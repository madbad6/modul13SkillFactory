package com.madbad;

public class CountThread implements Runnable{
    int count;
    @Override
    public void run() {
        synchronized (this) {
            count = 0;
            for (int i = 0; i < 3; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + ": " + count);
            }
        }
    }
}
