package ThreadLearn.Demo01Ticket;

public class RunnableImpl implements Runnable{

    //定义一个共享的票源
    private int Ticket = 100;

    @Override
    public void run(){

        //卖票
        while(true){
            //判断票是否存在
            if(Ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在卖第"+Ticket+"张票");
                Ticket--;
            }
        }
    }
}
