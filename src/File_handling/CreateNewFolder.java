package File_handling;

import java.io.File;

public class CreateNewFolder {
    public static void main(String[] args){
        File file=new File("FileContainer");
        boolean isFolderCreated=file.mkdir();
        System.out.println("folder is created  "+isFolderCreated);
    }
}
