package com.it18zhang.java.copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Johnny on 2018/3/22.
 * 递归打印输出目录结构
 */
public class TestCopyFile {
    public static void main(String[] args) {
        printDir("F:\\uplooking_file\\day3");
        //test copy dir
        copyDir("F:\\uplooking_file","E:\\uplooking_file");
    }

    private static void copyDir(String srcfile, String destdir) {
        File f = new File(srcfile);
        if(f.exists()){
            if(f.isDirectory()){
                //创建目录
                File newFile = new File(destdir, f.getName());
                newFile.mkdirs();

                File[] ff = f.listFiles();
                if(ff != null && ff.length > 0){
                    for (File f0 : ff){
                        copyDir(f0.getAbsolutePath() , newFile.getAbsolutePath());
                    }
                }
            }else{
                copyFile(srcfile , destdir);
            }
        }
    }

    private static void copyFile(String srcFile, String destdir) {
        try {
            File file = new File(srcFile);
            File newFile = new File(destdir, file.getName());
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(newFile);
            int len = 0;
            byte[] buf = new byte[1024];
            while((len = fis.read(buf)) != -1){
                fos.write(buf,0,len);
            }
            fos.close();
            fis.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }

    /*
         打印输出目录结构
     */
    private static void printDir(String file) {
        File f = new File(file);
        if(f.exists()){
            System.out.println(f.getAbsoluteFile());
            if(f.isDirectory()){
                File[] ff = f.listFiles();
                if(ff != null && ff.length > 0){
                    for (File f0 : ff){
                        printDir(f0.getAbsolutePath());
                    }
                }
            }
        }
    }





}
