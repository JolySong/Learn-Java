package GenericityLearn.FightingLandlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //1.准备牌
         ArrayList<String> Poker = Ready();

        //2.洗牌
        Poker = Shuffle(Poker);

        //3.发牌
        GetCard(Poker);

    }

    public static ArrayList<String> Ready(){
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，存放花色，牌号
        String[] colors = {"♥️","♠️","♦️","♣️"};
        String[] index = {"2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K ","A "};

        //循环嵌套遍历两个数组，组装52张牌
        for (String c : colors) {
            for (String n : index) {
                poker.add(c+n);
            }
        }
        poker.add("小王");
        poker.add("大王");

        return poker;
    }

    public static ArrayList<String> Shuffle(ArrayList<String> poker){
        //2.洗牌
        //使用集合工具类Collections中的方法
        //static void shuffle(list<?> list) 默认随机源对指定列表进行置换

        Collections.shuffle(poker);
        // System.out.println(poker);

        return poker;
    }

    public static void GetCard(ArrayList<String> poker){
        //3.发牌

        //定义三个玩家集合 一个底牌集合
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> DiPai = new ArrayList<>();

        Iterator<String> it = poker.iterator();

        //循环51次并且还有判定条件效率不高
//        for (int i = 0; i < 51; i++) {
//            if(i%3==0){
//                player01.add(it.next());
//            }else if(i%3==1){
//                player02.add(it.next());
//            }else{
//                player03.add(it.next());
//            }
//        }

        //循环执行17次
        for (int i = 0; i < 17; i++) {
            player01.add(it.next());
            player02.add(it.next());
            player03.add(it.next());
        }
        for (int i=0;i<3&&it.hasNext();i++){
            DiPai.add(it.next());
        }

        //显示所有人的牌
        System.out.println("玩家A: "+player01);
        System.out.println("玩家B: "+player02);
        System.out.println("玩家C: "+player03);
        System.out.println("地主牌: "+DiPai);
    }
}
