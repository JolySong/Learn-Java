package Demo05;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static void main(String[] args) {
        begin(new Random());
    }


    public static void begin(Random r){
        System.out.println("1.开始游戏 ");
        System.out.println("0.结束游戏 ");
        System.out.print("Please enter your select: ");
        Scanner scanf = new Scanner(System.in);

        if(scanf.nextInt()==1) {
            int num = r.nextInt(100) + 1;
            int cnt = 0;
            System.out.print("游戏开始，请输入1-100之间的数: ");
            while (true) {
                int x = scanf.nextInt();
                cnt++;
                if (x == num) {
                    switch (cnt) {
                        case 1:
                            System.out.println("Good！恭喜你一次就猜对了！！！");
                            break;
                        case 2:
                            System.out.println("Nice！恭喜你两次就猜对了！！");
                            break;
                        case 3:
                            System.out.println("还不错！你猜对了，一共猜了3次！");
                            break;
                        default:
                            System.out.println("恭喜你猜对了,你一共猜了" + cnt + "次！");
                            System.out.println("游戏结束！");
                            break;
                    }
                    break;
                } else if(x > num) {
                    System.out.print("您输入的数大了，请再次输入1-100之间的数: ");
                }else{
                    System.out.print("您输入的数小了，请再次输入1-100之间的数: ");
                }
            }
        }
        else{
            System.out.println("游戏结束！");
        }
    }

}
