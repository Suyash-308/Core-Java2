package Collection_Framework._3_Vector;

import java.util.Vector;
import java.util.function.Predicate;

public class Demo2RemovalIf {
    public static void main(String[] args){
        Vector vector=new Vector();
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(14);
        vector.add(15);
        vector.add(16);
        vector.add(17);

        System.out.println(vector);

        Predicate<Integer> oddRemoval=X->X % 2==1;
        vector.removeIf(oddRemoval);
        System.out.println(vector);





    }
}
