package File_handling;

import java.io.File;

public class Permission {
        public static void main(String[] args) {
            File file=new File("abc.txt");
            file.setWritable(false);
            System.out.println("File is read only");

    }

}
