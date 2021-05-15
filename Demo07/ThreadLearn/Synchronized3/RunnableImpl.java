package ThreadLearn.Synchronized3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现的线程安全问题使用lock锁

    java.util.concurrent.locks.lock接口
    lock 实现了比使用synchroized方法和语句可获得更广泛的锁定操作
    lock接口的方法：
            void lock();    获取锁
            void unlock();  释放锁

    使用步骤：
        1.在成员位置创建一个Reentranlock对象
        2.在可能会出现安全问题的代码前调用Lock接口中的lock() 获取锁 ;
        3.在可能会出现安全问题的代码后调用Lock接口中的unlock() 释放锁 ;

    
 */
public class RunnableImpl implements Runnable{
    //定义一个共享的票源
    private int Ticket = 100;

    //1.在成员位置创建一个Reentranlock对象
    Lock l = new ReentrantLock();


    @Override
    public void run(){

        while (true) {
            //2.在可能会出现安全问题的代码前调用Lock接口中的lock() 获取锁
            l.lock();

            //卖票
            payTicket();

        }
    }

    //把存在线程安全问题的代码放到方法中
    public void payTicket(){
        //先判断票是否存在
        if (Ticket > 0) {
            try{
                Thread.sleep(10);

                //票存在
                System.out.println(Thread.currentThread().getName() + "正在卖第" + Ticket + "张票");
                Ticket--;
            }catch(InterruptedException e){
                e.printStackTrace();
            }finally{
                //3.在可能会出现安全问题的代码后调用Lock接口中的unlock() 释放锁
                l.unlock();
            }

        }
    }
}
