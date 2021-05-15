package Recurrsion;

import java.io.File;
import java.util.Locale;

/*
    搜索文件，只要后缀名.java结尾的文件
 */
public class Demo03 {
    public static void main(String[] args) {
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/Recurrsion");
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
                //只要后缀名.java结尾的文件
                //1.把File对象f转为字符串对象
                    //String name = f.getName();
                    //String path = f.getPath();
                String s = f.toString();

                //把字符串转换为小写,忽略大小写
//                s = s.toUpperCase(Locale.ROOT);
//
//                //2.调用String类中的endsWith判断字符串是否以 .java结尾
//                if(s.endsWith(".JAVA")) {
//                    System.out.println(f);
//                }

                //链式编程
                if(f.getName().toLowerCase(Locale.ROOT).endsWith(".java")){
                    System.out.println(f);
                }
            }
        }

    }
}
