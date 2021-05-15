package InputAndOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写 append
    换行符 windows \r\n
          linux \n
          Mac   \n
 */
public class Demo03Output {
    public static void main(String[] args) throws IOException {

        //追加写法，续写
        FileOutputStream fos = new FileOutputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/c.txt",true);

//        fos.write("你好".getBytes());
//        fos.write(",世界".getBytes());

        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write(",世界".getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
