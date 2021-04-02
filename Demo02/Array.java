package Demo02;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[] {44,22,33,66,55,11};
        Address(arr);
        Arrlenght(arr);
        ArrSort(arr);
        print(arr);
        ArrReversal(arr);
        print(arr);
    }


    //获取数组地址
    public static void Address(int[] arr){
        System.out.println("VoluationArr的地址是: "+arr);
    }

    //获取数组长度
    public static void Arrlenght(int[] arr) {
        System.out.println("VoluationArr的长度是: " + arr.length);

    }

    //数组反转
    public static  void ArrReversal(int[] arr){
        for (int i=0,j=arr.length-1;j>i; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //冒泡排序
    public static void ArrSort(int[] arr) {

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void print(int[] arr){
        //面向对象的思想
        System.out.println(Arrays.toString(arr));
    }
}
