package day15.FileLX.FilefilterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Johnny on 2018/3/29.
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
                /*
            文件读取1
         */
        FileInputStream fis = new FileInputStream("D:\\feiq\\Recv Files\\day17\\propertiesTest2");
        Properties prop = new Properties();
        prop.load(fis);
        Set<String> keys = prop.stringPropertyNames();
        for(String k : keys){
            String value = prop.getProperty(k);
            System.out.println(value);
        }
    }
}
