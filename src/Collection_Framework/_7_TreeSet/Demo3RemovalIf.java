package Collection_Framework._7_TreeSet;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;


public class Demo3RemovalIf {
    public static void main(String[] args){
        Set set=new TreeSet();
        set.add(38);
        set.add(36);
        set.add(101);
        set.add(56);
        set.add(45678);
        set.add(8);

        System.out.println(set);

        Predicate<Integer> predicate=X->X%2==1;
        set.removeIf(predicate);

        System.out.println(set);

    }
}
