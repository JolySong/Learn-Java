package ThreadLearn.InnerClassThread;

import ThreadLearn.Runnable.RunnableImpl;

/*
    匿名内部类实现开启线程任务

    重写 父类/接口 中的run方法
    格式 父类/接口 (){
        @Override
        run(){

        }

    };
 */
public class Demo01 {
    public static void main(String[] args) {

        //
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"Hello,");
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r = new RunnableImpl()； 多态
        Runnable r = new RunnableImpl(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"World!");
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"世界你好");
                }
            }
        }).start();
    }
}
