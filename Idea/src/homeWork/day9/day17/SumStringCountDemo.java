package homeWork.day9.day17;

import java.io.*;

/**
 * Created by Johnny on 2018/3/29.
 * 2. 用代码实现以下需求
 (1)有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
 (2)打印格式：
 to=3
 think=1
 you=2
 //........
 (3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用高效流)
 */
public class SumStringCountDemo {
    public static void main(String[] args) throws IOException {
        String str="If you want to change your fate I think you must come to the dark horse" +
                "to learn java";
        int[] sum = new int[3];
        String[] strArr = str.split(" ");
        for(String str0 : strArr){
            if(str0.equals("to")){
                sum[0]++;
            }
            if(str0.equals("think")){
                sum[1]++;
            }
            if(str0.equals("you")){
                sum[2]++;
            }
        }
        String to = "to = " + sum[0];
        String think = "think = " + sum[1];
        String you = "you = " + sum[2];

        System.out.println(to + think + you);

        File file = new File("D:\\\\count.txt");
        FileWriter fos = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fos);

        for(int i = 0; i < sum.length; i++){
            bw.write(strArr[i] +  " = " + sum[i]);
            bw.newLine();
        }
        bw.close();
        fos.close();
    }
}
