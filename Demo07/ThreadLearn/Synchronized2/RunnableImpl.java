package ThreadLearn.Synchronized2;
/*
    卖票案例出现的线程安全问题
    使用同步方法，保证只让一个线程执行卖票任务

    使用步骤：
    public synchronized 返回值 方法名称(){
        存在线程安全问题的代码...
    }
    
 */
public class RunnableImpl implements Runnable{
    //定义一个共享的票源
    private int Ticket = 100;

    @Override
    public void run(){

        while (true) {
            payTicket();
        }
    }

    //把存在线程安全问题的代码放到有 synchronized 关键字的方法中
    public synchronized void payTicket(){
        //判断票是否存在
        if (Ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在卖第" + Ticket + "张票");
            Ticket--;
        }
    }
}
