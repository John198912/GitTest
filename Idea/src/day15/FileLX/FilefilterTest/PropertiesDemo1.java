package day15.FileLX.FilefilterTest;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Johnny on 2018/3/29.
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        /*
            设置元素
         */
        prop.setProperty("tom1" , "1");
        prop.setProperty("tom2" , "2");
        /*
            遍历内容
         */
        Set<String> keys = prop.stringPropertyNames();
        for(String k : keys){
            String value = prop.getProperty(k);
            System.out.println(value);
        }
        /*
            向文件保存1
         */
        OutputStream os = new FileOutputStream("D:\\feiq\\Recv Files\\day17\\propertiesTest1");
        PrintStream ps = new PrintStream(os);
        prop.list(ps);
        /*
            向文件保存2
         */
        FileOutputStream fos = new FileOutputStream("D:\\feiq\\Recv Files\\day17\\propertiesTest2");
        prop.store(fos, "propertiesDemo.properties");

    }
}
