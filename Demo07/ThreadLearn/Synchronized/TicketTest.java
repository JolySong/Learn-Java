package ThreadLearn.Synchronized;

public class TicketTest {
    public static void main(String[] args) {

        //创建接口的实现类
        RunnableImpl run = new RunnableImpl();
        //创建Thread对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
