package File_handling.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args)throws IOException {
        File file=new File("xyz.txt");
        FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write("Welcome in web development");
        fileWriter.close();
        System.out.println("Write operation completed");
    }
}
