package WaitAndNotify.BaoZiTest;

public class BaoZiPu extends Thread{

    int count = 0;

    private BaoZI bz;

    public BaoZiPu(BaoZI bz){
        this.bz = bz;
    }
    @Override
    public void run() {

        while (true) {
            synchronized (bz) {
                //对包子状态进行检查
                if (bz.Flag == true) {
                    //包子铺调用等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行的代码
                //生产包子,增加趣味性
                if (count % 2 == 0) {
                    //生产薄皮三鲜馅包子
                    bz.Pi = "薄皮";
                    bz.Xian = "三鲜馅";
                } else {
                    //生产厚皮牛肉馅包子
                    bz.Pi = "厚皮";
                    bz.Xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.Pi + bz.Xian + "包子");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //更改包子状态
                bz.Flag = true;
                bz.notify();
                System.out.println("包子铺已经做好" + bz.Pi + bz.Xian + "包子,吃货可以开吃了");

            }
        }
    }
}
