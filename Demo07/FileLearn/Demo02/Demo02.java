package FileLearn.Demo02;

import java.io.File;

/*
    public String getAbsolutePath();    返回此File的绝对路径名 字符串。
    public String getPath();            将此File转换为路径名 字符串。
    public String getName();            返回此File表示的文件或目录的名称。
    public Long length();               返回由此File表示的文件的长度。

 */
public class Demo02 {
    public static void main(String[] args) {
        Show01();
    }

    private static void Show01() {
        //public String getAbsolutePath();    返回此File的绝对路径名 字符串。
        File f1 = new File("/Library/Java/JavaVirtualMachines/");
        File absoluteFile = f1.getAbsoluteFile();
        System.out.println(absoluteFile);

        //public String getPath();            将此File转换为路径名 字符串。
        File f2 = new File("a.txt");
        File absoluteFile1 = f2.getAbsoluteFile();
        System.out.println(absoluteFile1);

        //public String getName();            返回此File表示的文件或目录的名称。
        File f3 = new File("a.txt");
        String name = f3.getName();
        System.out.println(name);

        //public Long length();               返回由此File表示的文件的长度。
        File f4 = new File("src/Demo02/a.txt");
        long length = f4.length();
        System.out.println(length);



    }
}
