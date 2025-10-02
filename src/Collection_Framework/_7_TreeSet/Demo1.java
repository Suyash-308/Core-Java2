package Collection_Framework._7_TreeSet;

import java.sql.ClientInfoStatus;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    // Homogeneous,unique,Sorting Order
    public static void main(String[] args){
        Set set=new TreeSet();
        set.add(38);
        set.add(36);

        System.out.println(set);

        Set list=new TreeSet();
        list.add(33);
        list.add(78);
        list.add(3678);

        set.addAll(list);
        System.out.println(set);
    }
}
