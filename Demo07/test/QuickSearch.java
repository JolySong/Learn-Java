package test;

public class QuickSearch {
    public static void main(String[] args) {
        int arr[]={65,34,74,24,89,1,58};
        System.out.println("排序前: ");
        for (int i : arr) {
            System.out.print(i+"\t");
        }

        sort(arr,0,arr.length-1);

        System.out.println("\n"+"排序后: ");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    //快速排序递归调用
    private static void sort(int[] arr, int low, int high) {
        if (low>=high){
            return;
        }
//        for (int i : arr) {
//            System.out.print(i+"\t");
//        }System.out.println();

        //完成第一轮排序
        int index = qucik(arr,low,high);
        //对左边排序
        sort(arr,low,index-1);
        //对右边排序
        sort(arr,index+1,high);
    }

    //进行第一轮排序，返回关键数据排序后索引
    public static int qucik(int[] arr, int begin, int end) {

        int key = arr[begin];
        while (begin<end){
            //从后向前搜索比key小的值,比key小的放左边
            while (arr[end] >= key && begin<end)
                end--;
            //交换
            arr[begin] = arr[end];

            //从前向后搜索比key大的值，比key大的放右边
            while (arr[begin] <= key && begin<end)
                begin++;
            //交换
            arr[end] = arr[begin];
        }
        //当begin == end 时，一轮排序结束
        arr[end] = key;
//        System.out.println(end);
//        //返回关键数据排序后索引
//        for (int i : arr) {
//            System.out.print(i+"\t");
//        }
//        System.out.println();
        return end;
    }


}
