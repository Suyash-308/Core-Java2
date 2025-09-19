package Collection_Framework.Vector;

import java.util.Collections;
import java.util.Vector;

public class Demo2Sorting {
    public static void main(String[] args){
        Vector vector=new Vector<>();
        vector.add("Suyash");
        vector.add("Shyam");
        vector.add("Aryan");
        vector.add("Alice");

        System.out.println(vector);

        Collections.sort(vector);
        System.out.println(vector);

    }
}
