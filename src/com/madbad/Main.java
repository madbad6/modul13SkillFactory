package com.madbad;

public class Main{
    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        Thread thread = new Thread(countThread);
        thread.start();
        Thread thread1 = new Thread(countThread);
        thread1.start();
    }
}



