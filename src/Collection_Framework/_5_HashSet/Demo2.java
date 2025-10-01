package Collection_Framework._5_HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args){
        HashSet hashSet=new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(30);
        hashSet.add("Hanuman");
        hashSet.add(90);
        hashSet.add("Bharat");

        System.out.println(hashSet);

        System.out.println(hashSet.size());




    }
}
