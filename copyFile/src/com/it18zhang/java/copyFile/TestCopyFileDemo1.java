package com.it18zhang.java.copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Johnny on 2018/3/22.
 */
public class TestCopyFileDemo1 {
    public static void main(String[] args) {
        printDir("F:\\uplooking_file\\day3");
        //test copy dir
        copyDir("F:\\uplooking_file","E:\\uplooking_file");
    }

    private static void copyDir(String file, String destDir) {
        File f = new File(file);
        if(f.exists()){
            if(f.isDirectory()){
                File newFile = new File(destDir,f.getName());
                newFile.mkdirs();
                File[] ff = f.listFiles();
                if( ff != null && ff.length > 0){
                    for(File f0 : ff){
                        copyDir(f0.getAbsolutePath(),newFile.getAbsolutePath());
                    }
                }
            }else{
                copyFile(file, destDir);
            }
        }
    }

    private static void copyFile(String file, String destDir) {

        try {
            File srcfile = new File(file);
            File destFile = new File(destDir , srcfile.getName());
            FileInputStream fis = new FileInputStream(srcfile);
            FileOutputStream fos = new FileOutputStream(destFile);

            byte[] buf = new byte[1024];
            int len = -1;
            while( (len = fis.read(buf)) != -1){
                fos.write(buf);
            }
            fis.close();
            fos.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void printDir(String file) {
        File f = new File(file);
        if(f.exists()){
            System.out.println(f.getAbsoluteFile());
            if(f.isDirectory()){
                File[] ff = f.listFiles();
                if(ff != null && ff.length > 0){
                    for(File f0 : ff){
                        printDir(f0.getAbsolutePath());
                    }
                }
            }
        }
    }
}
