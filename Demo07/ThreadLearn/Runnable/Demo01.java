package ThreadLearn.Runnable;
/*
    创建线程方式二
    采用java.lang.Runnable 非常常见的一种
    步骤
    1.定义Runnable接口的实现类，重写该接口的run方法，该run方法的方法体同样也是该线程的线程执行体
    2.创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
    3.调用线程对象的start方法启动线程。
 */
public class Demo01 {
    public static void main(String[] args) {

        //2.创建Runnable实现类的实例
        Runnable run = new RunnableImpl();
        Thread th = new Thread(run);

        //3.调用线程对象的start方法启动线程
        th.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
