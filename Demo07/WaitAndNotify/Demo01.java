package WaitAndNotify;

/*
    线程的睡眠wait() 和唤醒 notify();
    wait()；    等待唤醒状态。
    notify();   唤醒等待的单个线程。
 */

public class Demo01 {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个线程 消费者
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个
                synchronized (obj){
                    System.out.println("告知需求");

                    //调用wait方法，放弃cpu的执行，进入带Waiting状态（无限等待;
                    try{
                        obj.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("需求已经拿到.");
                }
            }
        }.start();

        //创建一个线程 生产者
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个
                synchronized (obj){
                    System.out.println("接到需求");
                    try{
                        //花了3秒做需求
                        Thread.sleep(3000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("需求已经做好了.");
                    //唤醒
                    obj.notify();
                }
            }
        }.start();
    }
}
