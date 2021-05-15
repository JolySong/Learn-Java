package ThreadPool;
/*

线程池的使用步骤：
    1.使用线程池的工厂类Excutors里面提供的静态方法newFixedThread生产一个新的线程池
    2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    3.调用ExecutorService中的submit，传递线程任务（实现类），开启线程，执行run方法
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类Excutors里面提供的静态方法newFixedThread生产一个新的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        //3.调用ExecutorService中的submit，传递线程任务（实现类），开启线程，执行run方法
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        //线程池会一直开启，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //调用ExecutorService中的方法shutdown销毁线程池（不建议执行）,销毁之后就不能再调用线程池
        es.shutdown();
    }
}
