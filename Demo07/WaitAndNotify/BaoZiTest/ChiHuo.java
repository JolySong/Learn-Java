package WaitAndNotify.BaoZiTest;

public class ChiHuo extends Thread{
    private BaoZI bz;

    public ChiHuo(BaoZI bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.Flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃" + bz.Pi + bz.Xian + "包子");
                bz.Flag = false;
                bz.notify();
                System.out.println("吃货吃了" + bz.Pi + bz.Xian + "包子，包子铺继续生产包子");
                System.out.println("==========================");
            }
        }
    }
}
