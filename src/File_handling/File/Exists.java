package File_handling.File;

import java.io.File;

public class Exists {
    public static void main(String[] args){
        File file=new File("abc.pdf");
        System.out.println("File is exists : "+file.exists());
    }

}
