package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinArraySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        try {
            System.out.printf("Please enter you want find number: ");
            int find = new Scanner(System.in).nextInt();
            if((find = binArraySearch(arr,find))!=-1){
                System.out.println("找到要找到数，在数组的第 "+(find+1)+"  个位置上");
            }else{
                System.out.println("No find it!");
            }
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static int binArraySearch(int[] arr,int findElment){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (low<=high){
            mid =  (high+low)/2;
            if(arr[mid] == findElment){
                return mid;
            }else if(findElment > arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        //没找到返回-1
        return -1;
    }

}
