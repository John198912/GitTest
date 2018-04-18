package copyFile.copyFileDemo;

import java.io.*;

/**
 * Created by Johnny on 2018/3/28.
 */
public class SplitFileDemo1 {
    public static void main(String[] args) {
        splitFile("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第20天\\图画.png" , 6);
    }

    private static void splitFile(String srcFile, int blockNum){
        try {
            File file = new File(srcFile);
            FileInputStream fis = new FileInputStream(file);
            int flen = (int) file.length();

            int blockSize = flen / blockNum;
            byte[] buf = new byte[1024];
            int len = 0;
            FileOutputStream fos = null;

            for(int i = 0; i < blockNum; i++){
                fos = new FileOutputStream(new File(file.getParent(), file.getName() + "-part" + i));
                if(i == (blockNum - 1)){
                    while((len = fis.read(buf)) != -1){
                        fos.write(buf, 0, len);
                    }
                    fos.close();
                }else{
                    if(blockSize <= buf.length){
                        buf = new byte[blockSize];
                        fis.read(buf);
                        fos.write(buf);
                        fos.close();
                    }else{
                        int count = blockSize / buf.length;
                        for(int j = 0; j < count; j++){
                            if(j == (count - 1)){
                                int tempNum = blockSize % buf.length;
                                if(tempNum != 0){
                                    buf = new byte[buf.length + tempNum];
                                    fis.read(buf);
                                    fos.write(buf);
                                    fos.close();
                                }
                             }else{
                                fis.read(buf);
                                fos.write(buf);
                            }
                        }
                    }
                }
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
