package File_handling;

import java.io.File;

public class DeleteFile {
    public static void  main (String[] args){
        File file=new File("abc.txt");
        boolean isFileDeleted= file.delete();
        System.out.println("file deleted "+ isFileDeleted);
    }
}
