package File_handling.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
    public static void main(String[] args)throws IOException {
        File file= new File("xyz.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        fileOutputStream.write("Hello java".getBytes());
        System.out.println("Write operation completed");
        fileOutputStream.close();
    }
}
