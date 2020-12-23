package com.yuan.test.thread;

/**
 * @author jianxin.yuan
 * @date 2020/11/29 下午6:28
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), r -> new Thread(() -> System.out.println("....")), new ThreadPoolExecutor.AbortPolicy());
        //executor.submit(new Thread(() -> System.out.println("xxxxx")));
        //executor.shutdown();


        //不推荐使用,都可能OOM
        //Executors.newCachedThreadPool();
        //Executors.newSingleThreadExecutor();
        //Executors.newFixedThreadPool();
        //Executors.newScheduledThreadPool();

        retry:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i="+i+",j="+j);

                if (j == 5) {
                    System.out.println("continue");
                    break retry;
                }

            }
        }



    }



}
