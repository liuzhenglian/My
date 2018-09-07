package Java多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by: Administrator 2018-08-27 17:16
 * 功能：学习ReentrantLock这个可重入锁的使用
 */
public class ReenTrantLock {
    private static Lock lock = new ReentrantLock();
    public static void testMethod(){
        lock.lock();
        for(int i = 0; i < 5; i++){
            System.out.println("ThreadName" + Thread.currentThread().getName());
        }
        lock.unlock();
    }

    public static void main(String[] args){
        testMethod();
    }
}
