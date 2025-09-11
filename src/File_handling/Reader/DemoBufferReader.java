package File_handling.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {
    public static void main(String[] args)throws IOException {
       File file  =new File("abc.txt");
        FileReader fileReader=new FileReader(file);
       BufferedReader bufferedReader=new BufferedReader(fileReader);
//       int value=bufferedReader.read();
//       while (value!=-1){
//           System.out.print((char)value);
//           value=bufferedReader.read();
//       }
        for (int i=0;i< file.length();i++){
            System.out.print((char) bufferedReader.read());
        }
        fileReader.close();
        bufferedReader.close();
    }
}
