package FightingLandLords;

import java.util.*;

public class game {

    public static void main(String[] args) {

        //1.准备牌

        //创建map集合,存储索引和组装好的牌
        HashMap<Integer, String> Poker = new HashMap<>();
        //创建list集合存储索引
        ArrayList<Integer> PokerIndex = new ArrayList<>();

        //定义两个数组，存放花色，牌号
        List<String> Colors = List.of("♥️","♠️","♦️","♣️");
        List<String> Index = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //循环嵌套遍历两个数组，组装52张牌
        int index=0;
        PokerIndex.add(index);
        Poker.put(index++,"大王");
        PokerIndex.add(index);
        Poker.put(index++,"小王");
        for (String i : Index) {
            for (String c : Colors) {
                Poker.put(index,c+i);
                PokerIndex.add(index);
                index++;
            }
        }

        //System.out.println(Poker);

        //2.洗牌
        Shuffle(PokerIndex);

        //System.out.println(PokerIndex);


        //3.发牌
        //定义三个玩家集合 一个底牌集合
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> DiPai = new ArrayList<>();

        //循环执行次
        for (int j = 0; j < index-3; j++) {
            if(j%3 == 0) {
                player01.add(PokerIndex.get(j));
            }else if(j%3 == 1){
                player02.add(PokerIndex.get(j));
            }else {
                player03.add(PokerIndex.get(j));
            }
        }

        for (int i=index-3; i<index; i++){
            DiPai.add(PokerIndex.get(i));
        }

        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(DiPai);

        //显示所有人的牌
        LookPoker("刘德华",Poker,player01);
        LookPoker("周星驰",Poker,player02);
        LookPoker("周润发",Poker,player03);
        LookPoker("底牌",Poker,DiPai);

    }



        public static void LookPoker(String name,HashMap<Integer, String >poker,ArrayList<Integer> list){
            //输出玩家名字，不换行
            System.out.print(name+" :");
            for(Integer key : list){
                String value = poker.get(key);
                System.out.print(value+" ");
            }
            System.out.println();
        }

        public static  void Shuffle(ArrayList<Integer> poker){
            //2.洗牌
            //使用集合工具类Collections中的方法
            //static void shuffle(list<?> list) 默认随机源对指定列表进行置换

            Collections.shuffle(poker);
            // System.out.println(poker);

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

        }


}
