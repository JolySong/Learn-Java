package Recurrsion;

import java.io.File;

/*
    递归打印多级目录
 */
public class Demo02 {
    public static void main(String[] args) {
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src");
        GetAllFile(f1);
    }

    private static void GetAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f:files){

            if(f.isDirectory()) {
                //如果是文件夹，继续遍历这个文件夹
                GetAllFile(f);
            }else {
                //是一个文件，直接打印
                System.out.println(f);
            }
        }

    }
}
