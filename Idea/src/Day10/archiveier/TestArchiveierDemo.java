package Day10.archiveier;

import java.util.ArrayList;

/**
 * Created by Johnny on 2018/3/21.
 */
public class TestArchiveierDemo {
    public static void main(String[] args) {
        testArchive();
    }

    public static void testArchive(){
        Archiveier a = new Archiveier();
        String archFile = "F:/JavaTestFile/archFile.xar";
        String txt = "F:/JavaTestFile/a.txt";
        String pdf = "F:/JavaTestFile/d.pdf";
        String docx = "F:/JavaTestFile/c.docx";
        a.archive(archFile, txt, pdf, docx);
    }

    public static void testUnarchive(){
        Archiveier a = new Archiveier();
        String archFile = "F:/JavaTestFile/archFile.xar";
        a.unarchive(archFile,"F:/JavaTestFile");
    }

    public void testArchFileNames(){
        Archiveier a = new Archiveier();
        ArrayList<String> list = (ArrayList<String>) a.getAllFileNames("F:/JavaTestFile/archFile.xar");
        for (String name : list){
            System.out.println(name);
        }

    }

}

