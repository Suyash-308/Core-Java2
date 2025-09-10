package File_handling;

import java.io.File;

public class ListOfAllFilesObj {
    public static void main(String[] args){
        File folder=new File("C:\\Users\\SUYAS\\IdeaProjects\\Core-Java2\\src\\Arrays");
        File[] listOfFiles= folder.listFiles();
        for(File file:listOfFiles){
            System.out.println(file.length()+"\t"+file.lastModified()+"\t"+file.getName());

        }
    }
}
