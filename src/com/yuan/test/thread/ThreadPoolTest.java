package com.yuan.test.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jianxin.yuan
 * @date 2020/11/29 下午6:28
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,
                5,
                60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Thread::new,
                new ThreadPoolExecutor.AbortPolicy());
        executor.execute(() -> System.out.println("xxx"));
        executor.shutdown();



        //不推荐使用,都可能OOM
        //Executors.newCachedThreadPool();
        //Executors.newSingleThreadExecutor();
        //Executors.newFixedThreadPool();
        //Executors.newScheduledThreadPool();




    }



}
