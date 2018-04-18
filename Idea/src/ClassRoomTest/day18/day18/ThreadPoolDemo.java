package ClassRoomTest.day18.day18;

import java.util.concurrent.*;

/**
 * Created by Johnny on 2018/3/30.
 * 线程池
 * 1.Executors：线程池创建工厂类
 *           public static ExecutorService newFixedThreadPool(int nThreads)：返回线程池对象
 * 2.ExecutorService：线程池类
 *           Future<?> submit(Runnable task)：获取线程池中的某一个线程对象，并执行
 * 3.Future 接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyRunnable mr = new MyRunnable();

        MyThreadFact mtf = new MyThreadFact(mr);
        ExecutorService service1 = Executors.newFixedThreadPool(2,mtf);

        //从线程池中获取线程对象,然后调用 MyRunnable 中的 run()
        service.submit(mr);
        service.submit(mr);
        service.submit(mr);

        //关闭线程池
        service.shutdown();
    }
}

class MyThreadFact implements ThreadFactory{
    private MyRunnable mr;

    public MyThreadFact(MyRunnable mr) {
        this.mr = mr;
    }

    public Thread newThread(Runnable r) {

        return null;
    }
}


class MyRunnable implements Runnable{
    public void run() {
        System.out.println("this thread is:" + Thread.currentThread().getName());
    }
}
