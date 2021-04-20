package ThreadLearn.Thread02;

public class MyThread extends Thread{

    public MyThread(){}

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        //获取线程名称
        //String name = getName();
        //System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }


}
