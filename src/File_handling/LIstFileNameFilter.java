package File_handling;

import java.io.File;
import java.io.FilenameFilter;

public class LIstFileNameFilter {
    public static void main(String[] args){
        File folder=new File("C:\\Users\\SUYAS\\IdeaProjects\\Core-Java2\\src\\Arrays");
        FilenameFilter filenameFilter=(File dir,String name)->name.startsWith("Demo11");
        String[] listOfFileNames= folder.list(filenameFilter);
        for(String fileName : listOfFileNames){
            System.out.println(fileName);
        }

    }
}
