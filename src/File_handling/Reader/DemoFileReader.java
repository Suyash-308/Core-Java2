package File_handling.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args)throws IOException {
        File file=new File("abc.txt");
        FileReader fileReader=new FileReader(file);
        for (int i=0;i<file.length();i++){
            System.out.print((char) fileReader.read());
        }
        fileReader.close();
    }
}

