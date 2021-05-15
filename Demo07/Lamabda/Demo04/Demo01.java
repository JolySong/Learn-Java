package Lamabda.Demo04;

public class Demo01 {
    public static void main(String[] args) {

        invokeCalc(100, 200, new Calculator() {
                    @Override
                    public int calc(int a, int b) {
                        return a+b;
                    }
                }
        );

        //使用Lamabda表达式简化匿名内部类的书写
        invokeCalc(10,20,(int a, int b)->{
            return a+b;
        });

        //优化省略Lamabda表达式
        invokeCalc(10,20,(a,b)-> a+b );

    }

    private static void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println("结果是："+ result);
    }
}
