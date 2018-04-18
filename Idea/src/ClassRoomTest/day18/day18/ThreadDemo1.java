package ClassRoomTest.day18.day18;

/**
 * Created by Johnny on 2018/3/30.
 */public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread dd = new MyThread();
        dd.start();
    }
}

class MyThread extends Thread{
    public void run() {
        try {
            while (true){
                sleep(1000);
                System.out.println("我的线程：正在执行！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

