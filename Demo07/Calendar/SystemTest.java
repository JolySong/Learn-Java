package Calendar;
/*
    java.lang.System类提供类大量的静态方法
        -public static long currentTimeMillis(); 返回以毫秒为单位的当前时间.
        -public static void arrarycopy(Object src, int srcPos, Object dest, int destPos, int Length) :
                将数组中指定的数据拷贝到另一个数组中.
*/
public class SystemTest {

    public static void main(String[] args) {
        //测算程序耗时
        System.out.println("程序共耗时:" + CountTime() +" 毫秒");

        //将数组拷贝到另一个数组中
        CopyArray();
    }

    private static void CopyArray() {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        int[] arr2 = new int[10];

        System.arraycopy(arr1,0,arr2,0,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    private static long CountTime() {
        //程序执行钱，获取一次毫秒值
        long s = System.currentTimeMillis();

        //执行循环
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        //程序执行后，在获取一次毫秒值
        long e = System.currentTimeMillis();

        return e-s;
    }

}
