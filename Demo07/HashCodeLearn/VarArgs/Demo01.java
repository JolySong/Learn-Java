package HashCodeLearn.VarArgs;

/*
可变参数，求和

    使用：
         public static E Funtion(E... arr);

    注意：
        1.一个方法的参数列表只能用一个可变参数
        2.如果方法的参数有多个，可变参数必须写在参数的最右边
        public static E Funtion(int a, String b, E... arr);

 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Sum1(1,2));

        System.out.println(Sum2(1,2,3));

        System.out.println(Sum3(1,2,3,4,5));
    }

    public static int Sum1(int a, int b){
        return a+b;
    }

    public static int Sum2(int a, int b, int c){
        return a+b+c;
    }

    /*
        定义计算（0 - n）整数的方法 计算整数的和
        参数不确定，可以使用可变参数
        底层是一个数组
     */
    public static int Sum3(int... arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
