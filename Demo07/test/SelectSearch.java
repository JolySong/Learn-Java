package test;
/*
    选择排序
 */
public class SelectSearch {
    public static void main(String[] args) {
        int arr[]={65,34,74,24,89,1,58};
        System.out.println("排序前: ");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
        select(arr);

        System.out.println("排序后: ");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void select(int[] a){

        for (int i = 0; i < a.length; i++) {
            int k=i;
            //选择待排序数列中最小的下标
            for (int j = i; j < a.length; j++) {
                if(a[k]>a[j]){
                    k = j;
                }
            }
            if(k!=i){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }
}
