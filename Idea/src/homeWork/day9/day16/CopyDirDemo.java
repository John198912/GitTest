package homeWork.day9.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Johnny on 2018/3/29.
 *
 * 递归复制目录结构
 */
public class CopyDirDemo {
    public static void main(String[] args) {
        copyDir("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第20天\\Java19",
                "E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第21天");
    }

    private static void copyDir(String srcFile, String destDir) {
        File file = new File(srcFile);
        if(file.exists()){
            if(file.isDirectory()){
                File newFile = new File(destDir, file.getName());
                newFile.mkdirs();
                File[] ff = file.listFiles();
                for(File f0 : ff){
                    copyDir(f0.getAbsolutePath() , newFile.getAbsolutePath());
                }
            }else{
                copyFile(srcFile,destDir);
            }
        }
    }

    private static void copyFile(String srcFile, String destDir) {
        try {
            File file = new File(srcFile);
            FileInputStream fis = new FileInputStream(file);
            File newFile = new File(destDir,file.getName());
            FileOutputStream fos = new FileOutputStream(newFile);

            byte[] buf = new byte[1024];
            int len = 0;
            while((len = fis.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
            fis.close();
            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
