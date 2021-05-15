package FileLearn.Demo01;

import java.io.File;

/*
    重点三个单词：
        file 文件
        directory 文件夹
        path 路径
 */
public class demo01 {
    public static void main(String[] args) {
        /*
            String pathSeparator 与系统有关的路径分割符，为了方便，表示为一个字符串。
            static char pathSeparatorChar 与系统有关的路径分割符。

            static String Separator 与系统有关的路径分割符，为了方便，表示为一个字符串。
            static char SeparatorChar 与系统有关的默认分割符。

        */

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  //路径分割符 windows ;   linux :

        String separator = File.separator;
        System.out.println(separator);      //文件名称分割符  windows \   linux /

    }
}
