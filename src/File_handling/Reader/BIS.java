package File_handling.Reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BIS {
    public static void main(String[] args)throws IOException {
        File file=new File("abc.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
//        for (int i=0;i<file.length();i++){
//            System.out.print((char) bufferedInputStream.read());
        int value=bufferedInputStream.read();
        while(value!=-1){
            System.out.print((char)value);
           value= bufferedInputStream.read();
        }
        fileInputStream.close();
        bufferedInputStream.close();
    }
}
