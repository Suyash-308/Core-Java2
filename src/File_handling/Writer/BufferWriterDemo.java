package File_handling.Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
public static void main(String[] args)throws IOException {
    File file=new File("xyz.txt");
    FileWriter fileWriter=new FileWriter(file,true);
    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
    bufferedWriter.write(" Front end development");
    bufferedWriter.close();
    fileWriter.close();
    System.out.println("Write operation completed");
    }
}
