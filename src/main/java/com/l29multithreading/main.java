package com.l29multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class main {

    public static void main(String[] args) {

//         RunnableDemo r1 = new RunnableDemo("thread-1");
//         r1.start();
//
//         RunnableDemo r2 = new RunnableDemo("Thread-2");
//         r2.start();

//        ThreadDemo td1 = new ThreadDemo("thread-1");
//        td1.start();
//
//        ThreadDemo td2 = new ThreadDemo("thread-2");
//        td2.start();

//        Object n = "thread-1";
//        Thread t = new Thread(() -> test(n), n.toString());
//        t.start();
//
//        Object n2 = "thread-2";
//        Thread t2 = new Thread(() -> test(n2), n2.toString());
//        t2.start();

        futureTaskTest();
    }

    static void test(Object name) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + name.toString() + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("thread " + name + " interrupted.");
        }
    }

    static void futureTaskTest() {
        CallableThread ct = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<>(ct);

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
            if (i == 10) {
                new Thread(ft, "有返回值的线程").start();
            }
        }

        try {
            System.out.println("子线程的返回值：" + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
