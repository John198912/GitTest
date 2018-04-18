package com.it18zhang.java.copyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Johnny on 2018/3/22.
 * 多线程拷贝文件
 */
public class MultiThreadCopier {
    public static void main(String[] args) throws FileNotFoundException {
        MultiThreadCopier mtcp = new MultiThreadCopier();
        String src = "F:\\uplooking_file\\day3\\day11_作业.txt";
        String dest = "F:\\uplooking_file\\day3\\day12_作业.txt";
        mtcp.copy(src,dest,3);
    }
    /*
        复制文件
     */
    public void copy(String srcFile, String destFile, int threadCount) {
        File sf = new File(srcFile);
        //源文件长度
        int length = (int) sf.length();
        //每个线程复制的块大小
        int blockSize = length / threadCount;

        for(int i = 0; i < threadCount; i++){
            int endPos = 0;
            if(i != (threadCount - 1)){
                endPos = ( i + 1 ) * blockSize - 1;

            }else{
                endPos = length - 1;
            }
            new CopyThread(i * blockSize , endPos, srcFile, destFile).start();
        }
    }

    class CopyThread extends Thread {

        private int startPos;
        private int endPos;
        private String srcFile;
        private String destFile;

        public CopyThread(int startPos, int endPos, String srcFile, String destFile) {
            this.startPos = startPos;
            this.endPos = endPos;
            this.srcFile = srcFile;
            this.destFile = destFile;
        }

        public void run() {
            try {
                RandomAccessFile src = new RandomAccessFile(srcFile, "r");
                RandomAccessFile dest = new RandomAccessFile(destFile, "rw");
                src.seek(startPos);
                dest.seek(startPos);

                int byteNums = endPos - startPos + 1;
                byte[] buf = new byte[1024];
                int count = 0;

                int mod = byteNums % buf.length;
                if(mod == 0){
                    count = byteNums/ buf.length + 1;
                }else{
                    count = byteNums / buf.length;
                }

                for(int i = 0; i < count; i++){
                    if(i == (count - 1)){
                        src.read(buf,0,(mod == 0) ? buf.length : mod);
                        dest.write(buf,0,(mod == 0) ? buf.length : mod);
                        dest.close();
                        src.close();
                    }else{
                        src.read(buf);
                        dest.write(buf);
                    }
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
