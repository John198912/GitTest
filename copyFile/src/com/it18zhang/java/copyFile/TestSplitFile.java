package com.it18zhang.java.copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Johnny on 2018/3/22.
 * 将文件切片
 */
public class TestSplitFile {
    public static void main(String[] args) {
        splitFile("F:\\uplooking_file\\day3\\day11_作业.txt");
    }

    private static void splitFile(String srcFile){
        try {
            // 创建File对象和流
            File f = new File(srcFile);
            FileInputStream fis = new FileInputStream(f);
            //获取文件大小
            int len = (int)f.length();
            int block = 3;
            int blockSize = len / 3 ;

            byte[] buf = new byte[1024];
            int len0 = -1;

            for(int i = 0; i < block; i++){
                FileOutputStream fos = new FileOutputStream(new File(f.getParent(),f.getName() +  "-part" + i));
                if(i == (block - 1)){
                    while((len0 = fis.read(buf)) != -1){
                        fos.write(buf);
                    }
                    fos.close();
                }
                else{
                    if(blockSize <= buf.length){
                        buf = new byte[blockSize];
                        fis.read(buf);
                        fos.write(buf);
                        fos.close();
                    }
                    else{
                        int count = blockSize / buf.length;
                        for (int j = 0; j < count; j++){
                            if(j == count - 1){
                                if(blockSize % buf.length != 0){
                                    buf = new byte[buf.length + blockSize % buf.length];
                                    fis.read(buf);
                                    fos.write(buf);
                                    fos.close();
                                }
                            }
                            else{
                                fis.read(buf);
                                fos.write(buf);
                            }
                        }
                    }
                }
            }
        fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
