package ThreadLearn.Thread03;

    /*
    public static void sleep(long millis); 使当前正在执行的线程以指定的毫秒数暂停
     */
public class ThreadSleep {
    public static void main(String[] args) {

        //模拟秒表
        for (int i = 0; i <= 60 ; i++) {
            System.out.println(i);

            //使用Thread类中的方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
