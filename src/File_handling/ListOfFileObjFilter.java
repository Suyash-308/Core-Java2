package File_handling;

import java.io.File;
import java.io.FileFilter;

public class ListOfFileObjFilter {
    public static void main(String[] args){
        File folder=new File("C:\\Users\\SUYAS\\IdeaProjects\\Core-Java2\\src\\Arrays");
        FileFilter fileFilter=fileObj->fileObj.length()>500;
        File[] listOfFiles=folder.listFiles(fileFilter);
        for(File file:listOfFiles){
            System.out.println(file.length()+"\t"+file.getName());
        }
    }
}
