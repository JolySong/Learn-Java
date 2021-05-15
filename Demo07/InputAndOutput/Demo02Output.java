package InputAndOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02Output {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象，构造方法中绑定要填入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/b.txt"));

        //2.写数据
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);

        fos.write(bytes,2,3);

        String str = "你好，世界";
        fos.write(str.getBytes());
        //关闭系统资源
        fos.close();
    }
}
