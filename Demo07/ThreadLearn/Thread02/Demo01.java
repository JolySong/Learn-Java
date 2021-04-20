package ThreadLearn.Thread02;
/*
    查看线程名称
    Thread.currentThread().getName();

    设置线程名称
    setName
 */
public class Demo01 {
    public static void main(String[] args) {
        //设置线程名称 2
        MyThread mt = new MyThread("线程0");

        //开启多线程
        mt.start();
        //System.out.println(Thread.currentThread().getName());

        //设置线程名称 1
        //mt.setName("线程1");

        new MyThread("线程2").start();
        new MyThread("线程3").start();


        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
