package Collection_Framework._3_Vector;

import java.util.Collections;
import java.util.Vector;

public class Demo2Sorting {
    public static void main(String[] args){
        Vector<String> vector=new Vector<>();
        vector.add("Subhash");
        vector.add("Shyam");
        vector.add("Aryan");
        vector.add("google");
        vector.add("Alice");

        // Small char have the highest order

        System.out.println(vector);

        Collections.sort(vector);
        System.out.println(vector);

    }
}
