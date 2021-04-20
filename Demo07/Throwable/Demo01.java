package Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable 类是java中所有的错误和异常的超类
        Exception：编译期异常，进行编译（写代码）java程序出现的问题。
            RuntimeException：运行期异常
        Eroor：错误
 */
public class Demo01 {
    public static void main(String[] args) /*throws ParseException*/ {

        //编译出现的异常
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");//格式化日期
        try {
            Date date = sdf.parse("2020-02-02"); //把字符串格式日期解析为date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //运行出现的异常
        try{
            int arr[] = {0,1,3};
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("后期代码");
    }
}
