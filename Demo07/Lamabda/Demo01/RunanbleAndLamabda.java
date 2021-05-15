package Lamabda.Demo01;

import Lamabda.Demo01.RunnableImpl;

public class RunanbleAndLamabda {
    public static void main(String[] args) {
        //第一种方式创建线程实现类
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        //第二种方式创建线程匿名类
        Runnable r = new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+"创建类一个新的线程");
            }
        };
        new Thread(r).start();

        //第三种方式创建线程匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建类一个新的线程");

            }
        }).start();

        //使用lamabda创建线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"创建类一个新的线程");
        }).start();

        //Lamabda表达式优化写法
        new Thread(()->System.out.println(Thread.currentThread().getName()+"创建类一个新的线程")).start();
    }
}