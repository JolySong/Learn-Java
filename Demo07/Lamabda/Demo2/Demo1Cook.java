package Lamabda.Demo2;

public class Demo1Cook {
    public static void main(String[] args) {

        //普通形式调用接口抽象方法
        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });

        //Lamabda调用接口抽象方法
        invokeCook(()->{
            System.out.println("吃饭了");
        });

        //Lamabda表达式优化写法
        invokeCook(()->System.out.println("吃饭了"));
    }

    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
