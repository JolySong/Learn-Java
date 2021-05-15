package ThreadLearn.Synchronized;
/*
    卖票案例出现的线程安全问题
    使用同步代码块锁住，保证只让一个线程执行卖票任务

    使用步骤：
        1.创建一个对象
        2.把存在线程安全问题的代码放到Synchronized()中
 */
public class RunnableImpl implements Runnable{

    //1.创建一个对象
    Object obj = new Object();

    //定义一个共享的票源
    private int Ticket = 100;

    @Override
    public void run(){

        //同步代码块
        //2.把存在线程安全问题的代码放到Synchronized()中
        synchronized(obj) {

            //卖票
            while (true) {
                //判断票是否存在
                if (Ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + Ticket + "张票");
                    Ticket--;
                }
            }
        }
    }
}
