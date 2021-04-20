package Throwable;

import java.io.IOException;
import java.util.List;

public class TryCatch {
    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("C:\\a.txt");
        }catch (IOException e){
            //异常的处理逻辑
            System.out.println(e);
        }finally {
            //无论是否出现异常都会执行的代码
            System.out.println("资源释放");
        }
        System.out.println("后续代码");
        System.out.println("--------------------");

        /*一个try多个catch注意
            catch里边定义的异常变量，如果有继承关系，那么子类必须写在父类的上面，否则会报错
         */
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);

            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException s){
            System.out.println(s);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }



    }

    public static void readFile(String fileName) throws IOException{
        if (! fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
