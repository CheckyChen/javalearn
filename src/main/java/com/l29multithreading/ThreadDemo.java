package com.l29multithreading;

public class ThreadDemo extends Thread {

    private String threadName;
    private Thread t;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating thread " + threadName);
    }

    public void run() {
        System.out.println("Running thread " + threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running thread " + threadName + ",step " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Stopped thread " + threadName);
    }

    public void start() {
        System.out.println("Starting thread " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
