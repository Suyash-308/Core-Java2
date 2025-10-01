package Collection_Framework._5_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.function.Predicate;

public class Demo4Removal {
    public static void main(String[] args){
        HashSet hashSet=new HashSet<>();
        hashSet.add(20);
        hashSet.add(21);
        hashSet.add(202);
        hashSet.add(23);
        hashSet.add(24);
        hashSet.add(26);
        hashSet.add(27);

        System.out.println(hashSet);

        Predicate<Integer> predicate=x->x%2==0;

        hashSet.removeIf(predicate);
        System.out.println(hashSet);




    }
}
