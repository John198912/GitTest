package homeWork.day9.day17;

import java.io.*;

/**
 * Created by Johnny on 2018/3/30.
 */
public class ChangeStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第21天\\笔记.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] buf = new char[1024];
        int len = 0;

        while((len = isr.read(buf)) != -1){
            System.out.println(buf);
        }
    }
}
