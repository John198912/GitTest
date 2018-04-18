package homeWork.day9.day15;

import java.io.File;
import java.util.*;

/**
 * Created by Johnny on 2018/3/29.
 * 5.键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数,注意:用文件类型(后缀名,不包含.(点),
 * 如："java","txt")作为key,
    用个数作为value,放入到map集合中,并用两种方式遍历map集合
    例如：
    doc 的类型的文件有  3 个
    java 的类型的文件有  5 个
    txt 的类型的文件有  7 个
 */
public class SumFileType {
    public static void main(String[] args) {
        String[] keys = {".java" , ".txt" , ".png"};
        int[] sum = new int[3];
        Map<String , Integer> fileMap = new HashMap<String , Integer>();
        getListFile("E:\\BaiduNetdiskDownload\\01-javase+mysql+jdbc资料\\Java基础第21天", keys, sum);
        for(int i = 0 ; i < keys.length ; i++){
            fileMap.put(keys[i].substring(1) , sum[i]);
        }
        /*
            显示HashMap数据
         */
        System.out.println(fileMap);
        /*
            遍历hash数据1
         */
        Set<String> keysSet = fileMap.keySet();
        Iterator<String> it = keysSet.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println("key: " + key + " value:" + fileMap.get(key));
        }
        /*
            遍历hash数据2
         */
        System.out.println("--------------------Demo2----------------------");
        Set<Map.Entry<String , Integer>> entrySet = fileMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            System.out.println("key: " + key + " value:" + fileMap.get(key));
        }

    }

    public static void getListFile(String srcFile, String[] keys, int[] sum){
        File file = new File(srcFile);
        if(file.isDirectory()){
            File[] ff = file.listFiles();
            for(File f0 : ff){
                if(f0.isDirectory()){
                    getListFile(f0.getAbsolutePath() , keys, sum);
                }else{
                    String fileName = f0.getName();
                    for(int i = 0; i < keys.length; i++){
                        if(fileName.endsWith(keys[i])){
                            sum[i]++;
                        }
                    }
                }
            }
        }
    }
}
