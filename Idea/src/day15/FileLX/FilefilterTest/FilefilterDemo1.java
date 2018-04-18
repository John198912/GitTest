package day15.FileLX.FilefilterTest;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created by Johnny on 2018/3/27.
 */
public class FilefilterDemo1 {
    public static void main(String[] args) {
        File f = new File("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第19天");
        File[] ff = f.listFiles(new MyFileNamefilter());

        for(File file: ff){
            System.out.println(file);
        }
    }
}

class MyFilefilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }
}

class MyFileNamefilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}