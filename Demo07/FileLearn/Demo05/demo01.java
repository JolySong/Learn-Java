package FileLearn.Demo05;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Locale;

/*
    文件过滤器 FileFilter ，需要实现类
 */
public class demo01 {
    public static void main(String[] args) {
            File f1 = new File("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src");
            GetAllFile(f1);
    }

    private static void GetAllFile(File dir) {

        //过滤器使用实现类 过滤
        File[] files = dir.listFiles(new FileFilterImpl()); //传递过滤器对象

        //过滤器使用匿名内部类 过滤
        File[] files2 = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) return true;
                return pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java");
            }
        });

        //自己封装成File类实现过滤规则
        File[] files3 = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java");
            }
        });

        //使用Lambda表达式1 实现过滤规则
//        File[] files4 = dir.listFiles((File dir2,String name)->{
//             return new File(dir2,name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java");
//        });
        //Lambda更简化
        File[] files4 = dir.listFiles((d,name)-> new File(dir,name).isDirectory() || name.toLowerCase(Locale.ROOT).endsWith(".java"));
        
        //使用Lambda表达式2  实现过滤规则
//        File[] files5 = dir.listFiles((File pathname)->{
//            if (pathname.isDirectory()) return true;
//            return pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java");
//        });
        //Lambda更简化
        File[] files5 =dir.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java"));

        for (File f:files5){

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
