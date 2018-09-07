package Java多线程;

/**
 * Created by: Administrator 2018-08-27 20:47
 * 功能：实现object类中的wait,notify,notifyAll;thread类中的sleep,yield,join
 */
public class StartThread extends Thread{
    public static void main(String[] args) {

        //实现wait，线程会开始等待
        StartThread startThread = new StartThread();
        startThread.startTread();

        //实现notify，唤醒等待的线程

    }
    /**
     * 线程锁
     */
    private final Object object = new Object();

    /**
     * 启动线程
     */
    public void startTread(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("开始线程---");
                System.out.println("进入等待状态----");
                synchronized (object){
                    try {
                        object.wait(111);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("线程结束啦----");
            }
        });
        t.start();
    }

    public void startTread2(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始线程---");
                System.out.println("进入等待状态----");
                    try {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                System.out.println("线程结束啦----");
            }
        });
        t.start();
    }

    public void startTread3(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("先等我执行完在执行你");
            }
        });
        t.start();
    }

}
class threadJoin extends Thread{
    @Override
    public void run(){
        System.out.println("hello world!");
    }
}

