package Collection_Framework._6_LinkedHashSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Demo2Insertion {
    public static void main(String[] args){
        LinkedHashSet linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(29);
        linkedHashSet.add("Mahakal");
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        LinkedHashSet addList=new LinkedHashSet<>();
        addList.add("Hanuman");
        addList.add(76);

        linkedHashSet.addAll(addList);
        System.out.println(linkedHashSet);

    }
}
