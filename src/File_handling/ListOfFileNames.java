package File_handling;

import java.io.File;

public class ListOfFileNames {
    public static void main(String[] args){
        File folder=new File("C:\\Users\\SUYAS\\IdeaProjects\\Core-Java2\\src\\Arrays");
        String[] listOfFileNames=folder.list();
        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}
