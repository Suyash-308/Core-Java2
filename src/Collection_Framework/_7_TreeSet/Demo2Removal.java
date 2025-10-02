package Collection_Framework._7_TreeSet;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2Removal {
    public static void main(String[] args){
        Set set=new TreeSet<>();
        set.add("Ram");
        set.add("Alice");
        set.add("Suyash");
        set.add("Shyam");
        set.add("Mahakal");

        System.out.println(set);

        set.remove("Alice");
        System.out.println(set);

        Set list=new TreeSet();
        list.add("Suyash");
        list.add("Mahakal");

        set.removeAll(list);
        System.out.println(set);

        Set ret=new TreeSet();
        ret.add("Ram");

        set.retainAll(ret);
        System.out.println(set);




    }
}
