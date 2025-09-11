package File_handling.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIS {
    public static void main(String[] args)throws IOException {
        File file=new File("abc.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        for (int i=0;i< file.length();i++){
            System.out.print((char) fileInputStream.read());
        }
        fileInputStream.close();
    }
}
