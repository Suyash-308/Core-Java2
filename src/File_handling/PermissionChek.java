package File_handling;

import java.io.File;

public class PermissionChek {
    public static void main(String[] args){
        File file=new File("abc.txt");
        System.out.println("Can we write inside the  file : "+file.canWrite());
    }
}
