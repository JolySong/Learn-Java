package InputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    input读取数据
 */
public class Demo04Input {
    public static void main(String[] args) throws IOException {
        //1.创建读取数据的对象
        FileInputStream fis = new FileInputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/a.txt");

        //2.读取单个数据
//        int temp = 0;
//        while((temp = fis.read())!= -1){
//            System.out.println(temp);
//        }
//        System.out.println("------------------");
//
//        fis.close();
//        fis = new FileInputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/a.txt");

        //2.读取多个数据
//        byte[] bytes = new byte[3];
//        int len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));

        //2.读取多个数据

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1 ){
            //String(byte[] bytes, int offset, int length)  把字节数组的一部分转换为字符串,offset数组的开始开始,length结束索引
            System.out.println(new String(bytes,0,len));
        }


        //3.释放资源
        fis.close();

    }
}
