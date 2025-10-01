package Collection_Framework._5_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Demo1Insertion {
    public static void main(String[] args){

        // Unique,Homogeneous,Heterogeneous,Null(only one).

        HashSet hashSet=new HashSet<>();
        hashSet.add(30);
        hashSet.add(38);
        hashSet.add(20);
        hashSet.add(22);
        hashSet.add("Hello");
        hashSet.add(null);

        System.out.println(hashSet);

        HashSet set=new HashSet<>();
        set.add("Suyash");
        set.add(20);

        hashSet.addAll(set);
        System.out.println(hashSet);

        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(20));
    }
}
