import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Demo4Removal {
    public static void main(String[] args){
        Set <Integer>set=new LinkedHashSet();
         set.add(20);
         set.add(21);
         set.add(202);
         set.add(23);
         set.add(24);
         set.add(26);
         set.add(27);
         System.out.println(set);

        Predicate<Integer> predicate=X-> X%3==0;
        set.removeIf(predicate);

        System.out.println(set);
    }
}
