package Day10.archiveier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnny on 2018/3/21.
 */
public class Archiveier {
    public void archive(String archFile, String... srcFiles){
        for(String srcFile : srcFiles){
            appendFile(archFile,srcFile);
        }
    }

    private void appendFile(String archFile, String srcFile) {
        try {
            //创建文件输出流
            FileOutputStream fos = new FileOutputStream(archFile, true);
            //获得头文件
            String FileName = getFileName(srcFile);
            //写入文件名长度。
            fos.write(int2ByteArr(FileName.length()));
            //写入文件名
            fos.write(FileName.getBytes());
            //存储文件长度
            FileInputStream fis = new FileInputStream(srcFile);
            fos.write(int2ByteArr(fis.available()));
            //文件内容
            byte[] buf = new byte[1024];
            int len = -1;
            while((len = fis.read(buf)) != -1){
                fos.write(buf,0,len);
            }
            fis.close();
            fos.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
/*
    解归档
 */
    public void unarchive(String archFile, String destDir){
        try {
            FileInputStream fis = new FileInputStream(archFile);

            byte[] fnameLenBuf = new byte[4];
            while(fis.read(fnameLenBuf) != -1){
                //读取文件名长度
                int fnameLenth = byteArr2Int(fnameLenBuf);
                //读取文件名
                byte[] fnameBuf = new byte[fnameLenth];
                fis.read(fnameBuf);
                String fname = new String(fnameBuf);

                //文件内容长度
                byte[] fcontbuf = new byte[4];
                fis.read(fcontbuf);
                int flen = byteArr2Int(fcontbuf);
                //读取文件内容
                FileOutputStream fos = new FileOutputStream(destDir + "/" + fname);
                byte[] fileBuf = new byte[1024];
                //得到是否不满一个buf
                int mod = flen % fileBuf.length;
                //得到获取文件内容次数
                int count = 0 ;
                if(mod == 0){
                    count = flen / fileBuf.length;
                }
                else{
                    count = flen / fileBuf.length + 1;
                }
                for (int i = 0 ; i < count ; i++){
                    if( i == (count - 1)){
                        mod = (mod == 0 ? fileBuf.length : mod);
                        fis.read(fileBuf,0,mod);
                        fos.write(fileBuf,0,mod);
                    }else {
                        fis.read(fileBuf);
                        fos.write(fileBuf);
                    }
                }
            }
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getAllFileNames(String archFile){
        ArrayList<String> names = new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream(archFile);
            //文件名长度缓冲区
            byte[] fnameLenBuf = new byte[4];

            while(fis.read(fnameLenBuf) != -1){
                //读取4个字节的文件名长度
                int fnameLength = byteArr2Int(fnameLenBuf);
                //读取文件名
                byte[] fnameBuf = new byte[fnameLength];
                fis.read(fnameBuf);
                String fname = new String(fnameBuf);
                //保存文件名
                names.add(fname);

                //文件内容长度
                byte[] fcontBuf = new byte[4];
                fis.read(fcontBuf);
                int flen = byteArr2Int(fcontBuf);
                //跳过flen字节内容
                fis.skip(flen);
            }
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return names;
    }


    private int byteArr2Int(byte[] arr) {
        return ((arr[0] & 0xff) << 24)
                | ((arr[1] & 0xff) << 16)
                | ((arr[2] & 0xff) << 8)
                | ((arr[3] & 0xff) << 0);
    }


    private byte[] int2ByteArr(int i) {
        byte[] arr = new byte[4];
        arr[0] = (byte)(i >> 24);
        arr[1] = (byte)(i >> 16);
        arr[2] = (byte)(i >> 8);
        arr[3] = (byte)(i >> 0);
        return arr;
    }

    private String getFileName(String srcFile) {
        String seq = null;
        if(srcFile.contains("\\")) {
            seq = "\\";
        }else{
            seq = "/";
        }
        return srcFile.substring(srcFile.lastIndexOf(seq));
    }

}
