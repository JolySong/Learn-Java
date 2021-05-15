package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTry {
    public static void main(String[] args) {

        //附一个初值，并提高作用域
        FileWriter fw = null;
        try{
            fw = new FileWriter("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/InputAndOutput/Exception.txt",true);

            for (int i = 0; i < 10; i++) {
                fw.write("Hello,World"+i+"\n");
            }
        }catch(IOException e) {
            System.out.println(e);
        }finally {
            //判断文件是否创建，决定是否释放资源
            if(fw != null) {
                try {
                    fw.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }
        }


    }
}
