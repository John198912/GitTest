package homeWork.day9.day16;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Johnny on 2018/3/29.
 * 3.键盘输入10个数，放到数组中
         (1)去除该数组中大于10的数
 (          2)将该数组中的数字写入到本地文件number.txt中
 */
public class ArrayToFileDemo {
    public static void main(String[] args) throws IOException {
        /*
            输入数据
         */
        Scanner sc = new Scanner(System.in);
        int tmpNum;
        byte[] buf = new byte[10];
        for(int i = 0; i < 10 ; i++){
            tmpNum = Integer.parseInt(sc.next());
            if(tmpNum <= 10){
                buf[i] = (byte) tmpNum;
                System.out.println("输入成功：" + tmpNum);
            }
            System.out.println("输入成功：" + buf[i]);
        }

        /*
            写入数据文件
         */
        File destFile = new File("F:\\Javawork\\Idea\\src\\homeWork\\day9\\day16\\number.txt");
        FileOutputStream fos = new FileOutputStream(destFile);
        fos.write(buf);
        fos.close();

        /*
            查看是否写入数据
         */
        FileInputStream fis = new FileInputStream(destFile);
        fis.read(buf);
        System.out.println("------------------------------");
        for(int i = 0; i < 10 ; i++){
            System.out.println("check number ：" + buf[i]);
        }

    }
}
