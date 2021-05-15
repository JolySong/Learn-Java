package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05Copy {
    public static void main(String[] args) throws IOException {
        long b = System.currentTimeMillis();

        //创建读取对象
        FileInputStream fis = new FileInputStream("/Users/song/Documents/Wall/1.jpg");

        //创建写入对象
        FileOutputStream fos = new FileOutputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/CopyTest/1.jpg");

        int len = 0;
        //开始拷贝操作 单个拷贝效率低，用数组作为缓存
//        while((len = fis.read() )!= -1){
//            fos.write(len);
//        }


        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //关闭读写资源（先关闭写的，后关读的）
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("程序共运行："+(e-b)+"毫秒");
    }
}
