package Collection_Framework._3_Vector;

import java.util.Collections;
import java.util.Vector;

public class Demo1Sorting {
    public static void main(String[] args){
        Vector vector=new Vector();
        vector.add(10);
        vector.add(45);
        vector.add(98);
        vector.add(2);
        vector.add(75);
        vector.add(43);

        System.out.println(vector);

        Collections.sort(vector);
        System.out.println(vector);





    }
}
