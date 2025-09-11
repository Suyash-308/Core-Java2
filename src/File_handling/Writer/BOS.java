package File_handling.Writer;

import java.io.*;

public class BOS {
    public static void main(String[] args)throws IOException {
        File file=new File("xyz.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(" What's Up!".getBytes());
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation completed");

    }
}
