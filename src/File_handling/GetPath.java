package File_handling;

import java.io.File;

public class GetPath {
    public static void main(String[] args){
        File file=new File("abc.txt");
        System.out.println("Path of file is : "+file.getPath());
    }
}
