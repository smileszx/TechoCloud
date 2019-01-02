package com.haoqi.tech.countdown;

import java.util.concurrent.CountDownLatch;

public class CountDownTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch threads = new CountDownLatch(3);

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("test1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                threads.countDown();
            }
        });
        t1.start();

        Thread t2 = new Thread(()-> {
            try {
                Thread.sleep(1000);
                System.out.println("test2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                threads.countDown();
            }
        });
        t2.start();
        threads.countDown();
        threads.await();
        System.out.println("test end");
    }
}
