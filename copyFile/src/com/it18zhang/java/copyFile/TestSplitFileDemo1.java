package com.it18zhang.java.copyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Johnny on 2018/3/22.
 */
public class TestSplitFileDemo1 {
    public static void main(String[] args) {

    }

    private static void testSplit(String srcFile,int blocks){
        try {
            File f = new File(srcFile);
            FileInputStream fis = new FileInputStream(f);

            int flen = (int) f.length();
            int blockSize = flen / blocks;

            byte[] buf = new byte[1024];
            int len0 = -1;

            for(int i = 0; i < blocks; i++){
                FileOutputStream fos = new FileOutputStream(new File(f.getParent(),f.getName() + "-part" + i));
                if(i == blocks - 1){
                    while((len0 = fis.read(buf)) != -1){
                        fos.write(buf,0,len0);
                    }
                    fos.close();
                }
                else{
                    if (blockSize <= buf.length){
                        buf = new byte[blockSize];
                        fis.read(buf);
                        fos.write(buf);
                    }
                    else{
                        int count = blockSize / buf.length;
                        for(int j = 0; j < count; j++){
                            if(count == j - 1){
                                if(blockSize % buf.length != 0){
                                    buf = new byte[buf.length + blockSize%buf.length];
                                    fis.read(buf);
                                    fos.write(buf);
                                    fos.close();
                                }else{
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
