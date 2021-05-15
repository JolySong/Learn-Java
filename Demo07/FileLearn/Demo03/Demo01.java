package FileLearn.Demo03;

import java.io.File;
import java.io.IOException;

/*
    public boolean mkdir();   创建一级文件夹
    public boolean mkdirs();  创建多级文件夹
    public boolean createNewFile(); 创建一个新的文件
    public boolean delete();    删除由此File代表的文件或目录

 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
        show04();

    }

    private static void show04() {
        //public boolean delete();    删除由此File代表的文件或目录
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/FileLearn/Demo03/aaa");
        boolean delete = f1.delete();
        System.out.println(delete);

    }

    private static void show03() throws IOException {
        //public boolean createNewFile(); 创建一个新的文件  会抛出IOException异常
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/FileLearn/Demo03/a.txt");
        boolean createnewfile = f1.createNewFile();
        System.out.println(createnewfile);
    }

    private static void show01() {
        //public boolean mkdir();   创建一级文件夹
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/FileLearn/Demo03/aaa");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

    }

    private static void show02() {
        //public boolean mkdirs();  创建多级文件夹
        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/FileLearn/Demo03/111/bbb/ccc");
        boolean mkdirs = f1.mkdirs();
        System.out.println(mkdirs);
    }


}
