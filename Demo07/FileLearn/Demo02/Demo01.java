package FileLearn.Demo02;

import java.io.File;

/*
    file类的构造方法有三种：
        file(String PathName);
        file(String parent, String child);
        file(File parent, String child);
 */
public class Demo01 {
    public static void main(String[] args) {

        Show01(File.separator+"Desktop");
        Show01(File.separator+"Desktop"+ File.separator+"a.txt");
        System.out.println("--------------------");

        Show02("Downloads"+File.separator,"a.txt");
        System.out.println("--------------------");

        Show03();
    }

    private static void Show03() {
        File file = new File("Decuments"+File.separator);
        File test = new File(file,"a.txt");
        System.out.println(test);
    }

    private static void Show02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void Show01(String PathName) {
        File Path = new File(PathName);
        System.out.println(Path);
    }
}
