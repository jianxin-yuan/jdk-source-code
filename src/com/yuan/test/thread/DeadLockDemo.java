package com.yuan.test.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jianxin.yuan
 * @date 2020/12/7 下午10:36
 */
public class DeadLockDemo {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            1,
            1,
            60, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(),
            new ThreadPoolExecutor.AbortPolicy());



    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("父线程任务执行....");
            for (int i = 0; i < 10; i++) {
                int x= i;
                executor.execute(() -> {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程"+x);
                });
            }
        }


    }

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        executor.execute(task);



        //executor.submit(() -> {
        //    try {
        //        System.out.println("aaaa");
        //        executor.submit(() -> System.out.println("bbbb")).get();
        //        System.out.println("cccc");
        //    } catch (InterruptedException | ExecutionException e) {
        //        System.out.println("error,"+e);
        //    }
        //});
    }

}

