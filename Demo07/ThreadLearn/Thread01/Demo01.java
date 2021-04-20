package ThreadLearn.Thread01;

/*
    创建多线程的第一种方式：创建Thread类的子类
    java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类

    实现步骤：
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
        3.创建Thread类的子类对象
        4.调用Thread类中的方法start，开启新的线程，执行run方法
 */
public class Demo01 {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();

        //4.调用Thread类中的方法start，开启新的线程，执行run方法
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("Main: "+i);
        }
    }
}
