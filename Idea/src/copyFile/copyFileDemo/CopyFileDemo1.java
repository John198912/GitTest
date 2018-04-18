package copyFile.copyFileDemo;

import java.io.*;

/**
 * Created by Johnny on 2018/3/27.
 */
public class CopyFileDemo1 {
    public static void main(String[] args) {
//        watchDirDemo1("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第20天");
          copyDir("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第20天\\Java20\\src",
                   "E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第20天");
    }
    /*
        递归复制文件夹
     */
    public static void copyDir(String srcFile, String destDir){
        File src = new File(srcFile);
        if(src.exists()){
            if(src.isDirectory()){
                File newFile = new File(destDir,src.getName());
                newFile.mkdirs();
                File[] ff = src.listFiles();
                if(ff != null && ff.length != 0){
                    for(File f0 : ff){
                        copyDir(f0.getAbsolutePath(),newFile.getAbsolutePath());
                    }
                }
            }else{
                copyFile(srcFile , destDir);
            }
        }
    }
    /*
        复制文件
     */
    private static void copyFile(String srcFile, String destDir) {
        try {
            File src = new File(srcFile);
            File newFile = new File(destDir, src.getName());
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(newFile);


            byte[] buf = new byte[1024];
            int len = 0;
            while((len = fis.read(buf)) != -1){
                fos.write(buf , 0 , len);
            }
            fis.close();
            fos.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


    /*
        递归查看文件目录
     */
    public static void watchDirDemo1(String srcFile) {
        File file = new File(srcFile);
        if(file.exists()){
            System.out.println(file.getAbsoluteFile());
            if (file.isDirectory()) {
                File[] ff = file.listFiles();
                if(ff != null && ff.length != 0){
                    for (File f0 : ff){
                        watchDirDemo1(f0.getAbsolutePath());
                    }
                }
            }
        }
    }
}



