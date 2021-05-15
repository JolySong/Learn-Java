package WaitAndNotify;
/*
    wait( 500 )； 睡眠500毫秒后自动唤醒
    notifyALl();唤醒所有等待的线程。
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个线程 消费者1
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个
                synchronized (obj){
                    while(true) {
                        System.out.println("消费者1告知需求");

                        //调用wait方法，放弃cpu的执行，进入带Waiting状态（无限等待;
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("消费者1需求已经拿到.");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();

        //创建一个线程 消费者2
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个
                synchronized (obj){
                    while(true) {
                        System.out.println("消费者2告知需求");

                        //调用wait方法，放弃cpu的执行，进入带Waiting状态（无限等待;
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("消费者2需求已经拿到.");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();

        //创建一个线程 生产者
        new Thread(){
            @Override
            public void run(){
                while(true) {
                    System.out.println("接到需求");
                    try {
                        //花了5秒做需求
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj) {
                        System.out.println("需求已经做好了.");
                        //唤醒所有等待的线程
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
