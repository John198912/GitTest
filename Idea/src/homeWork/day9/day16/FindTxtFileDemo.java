package homeWork.day9.day16;

import java.io.*;

/**
 * Created by Johnny on 2018/3/29.
 * 查找目录中的TXT文件。计数，并复制到指定目录。
 */
public class FindTxtFileDemo {
    public static void main(String[] args) {
        try {
            findTxtFile("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第21天");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findTxtFile(String srcDir) throws IOException {
        int count = 0;
        File dir = new File(srcDir);
        File[] ff = dir.listFiles(new MyFilenameFilterDemo1());

        FileOutputStream fos = null;
        FileInputStream fis = null;
        for(File f0 : ff){
            if(f0.isDirectory()){
                findTxtFile(f0.getAbsolutePath());
            }else{
                count ++;
                File destFile = new File("D:\\feiq\\Recv Files", f0.getName());
                fos = new FileOutputStream(destFile);
                fis = new FileInputStream(f0);
                byte[] buf = new byte[1024];
                int len = 0;
                while(( len = fis.read(buf)) != -1){
                    fos.write(buf);
                }
                fis.close();
                fos.close();
            }
        }
        System.out.println("txt文件数:" + count);
    }
}

class MyFilenameFilterDemo1 implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}

class MyFilenameFileterDemo2 implements FileFilter {
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }
}
