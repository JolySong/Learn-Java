package InputAndOutput;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
    java.io.Reader: 字符输入流的最顶层父类，是一个抽象类
    共性方法：
             int read();    一次读取单个字符并返回
             int read(char[] cbuf) 一次读取多个字符，并放入字符数组中
             void close();  关闭与之相关的所有资源
    java.io.FileReader extends InputStreamReader extends Reader
    FileReader: 文件字符输入流

 */
public class Demo06Reader {
    public static void main(String[] args) throws IOException {
        //获取系统时间毫秒值
        long b = System.currentTimeMillis();

        //1.创建对象
        FileReader fr = new FileReader("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/a.txt");

        //2.读取文件
        int len = 0;

        //单个读取效率低
//        while ((len = fr.read())!=-1){
//            System.out.print((char)len);
//        }
        //用数组缓存
        char[] arr = new char[1024];
        int i=0;
        while ((len = fr.read(arr))!=-1){
            System.out.print(new String(arr,0,len));
        }

        System.out.println();
        //3.释放资源
        fr.close();

        System.out.println("程序共运行："+(System.currentTimeMillis()-b)+"毫秒");
    }
}
