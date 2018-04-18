package day15.FileLX.FilefilterTest;

import java.io.File;

/**
 * Created by Johnny on 2018/3/27.
 */
public class GetFilesDemo1 {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第19天");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isDirectory()){
                getAllFiles(f);
            }
            System.out.println(f.getAbsoluteFile());
        }
    }
}
