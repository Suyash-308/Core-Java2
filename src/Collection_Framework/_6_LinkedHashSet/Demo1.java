package Collection_Framework._6_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args){
        // Homogeneous,Heterogeneous,Unique,Null(1),Insertion Order.
        Set set=new LinkedHashSet();
        set.add(10);
        set.add(48);
        set.add(34);
        set.add(54);
        set.add("Ram");
        set.add(null);
        set.add(null);
        set.add("3.3");

        System.out.println(set);


    }
}
