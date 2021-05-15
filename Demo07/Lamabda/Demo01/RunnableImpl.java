package Lamabda.Demo01;

public class RunnableImpl implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"创建类一个新的线程");
    }
}
