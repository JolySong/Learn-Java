package FileLearn.Demo04;

import java.io.File;

/*
    public String[] list(); 返回一个String数组，表示该File类中所有的目录和子文件
    遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称

    public String[] listFiles(); 返回一个File类型的数组，表示该File类中所有的目录和子文件

 */
public class Demo01
{
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {

        //public String[] listFiles(); 返回一个File类型的数组，表示该File类中所有的目录和子文件

        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src");
        File[] file = f1.listFiles();
        for(File f:file){
            System.out.println(f);
        }

    }

    private static void show01() {

        //public String[] list(); 返回一个String数组，表示该File类中所有的目录和子文件

        File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src");
        String[] arr = f1.list();
        for (String filename : arr){
            System.out.println(filename);
        }

    }
}
