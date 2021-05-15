package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.FileWriter
 */
public class Demo07Writer {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileWriter fw = new FileWriter("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/write.txt");

        //2.写入数据
        fw.write("你好世界");

        //3.刷新缓冲区到文件 刷新后可以继续写
        fw.flush();


        fw.write(97);

        //4.关闭资源
        fw.close();

    }
}
