package com.haoqi.tech.countdown;

import java.util.concurrent.CountDownLatch;

public class CountDownTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch threads = new CountDownLatch(3);

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                threads.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()-> {
            try {
                Thread.sleep(1000);
                threads.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threads.await();
        System.out.println("test end");
    }
}
