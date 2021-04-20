package Throwable;

/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常,返回给方法的调用者
    使用格式：
        throw new xxxException("异常产生的原因");
    注意：
        1. throw关键字必须写在方法的内部
        2.
 */
public class ThrowTest {
    public static void main(String[] args) {

        //int[] arr2 = null;
        //getElements(arr2,0);

        //int[] arr = {1,2,3};
        //getElements(arr,5);


    }
    public static int getElements(int[] arr,int index){

        //判断数组是否为空
        if(arr==null){
            throw new NullPointerException("数组为空");
        }
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        return arr[index];
    }
}
