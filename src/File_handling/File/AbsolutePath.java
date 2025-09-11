package File_handling.File;

import java.io.File;

public class AbsolutePath {
    public static void main(String[] args){
        File file=new File("abc.txt");
        System.out.println("Absolute path is : "+ file.getAbsolutePath());
    }
}
