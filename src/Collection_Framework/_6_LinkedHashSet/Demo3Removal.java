package Collection_Framework._6_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3Removal {
    public static void main(String[] args){
        Set set=new LinkedHashSet();
        set.add(10);
        set.add(48);
        set.add(34);
        set.add(54);
        set.add("Ram");
        set.add(null);
        set.add("3.3");

        System.out.println(set);

        set.remove(null);
        System.out.println(set);

        Set removeList=new LinkedHashSet();
        removeList.add(10);
        removeList.add(48);

        set.removeAll(removeList);
        System.out.println(set);

        Set retainList=new LinkedHashSet();
        retainList.add("Ram");

        set.retainAll(retainList);
        System.out.println(set);



    }
}
