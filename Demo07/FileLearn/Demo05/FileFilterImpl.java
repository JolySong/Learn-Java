package FileLearn.Demo05;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

//FileFilter实现类
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) return true;    //如果是一个文件夹，继续遍历文件夹内的
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
