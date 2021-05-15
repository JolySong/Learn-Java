package InputAndOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01Output {
    public static void main(String[] args) throws IOException {
        //创建FIleOutputStream对象，构造方法传递路径
        FileOutputStream fos = new FileOutputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/a.txt");

        //写入数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //关闭系统资源
        fos.close();
    }
}
