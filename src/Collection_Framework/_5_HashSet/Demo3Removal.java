package Collection_Framework._5_HashSet;

import java.util.HashSet;

public class Demo3Removal {
    public static void main(String[] args){
        // Unique,Homogeneous,Heterogeneous,Null(only one).

        HashSet hashSet=new HashSet<>();
        hashSet.add(30);
        hashSet.add(38);
        hashSet.add(20);
        hashSet.add(22);
        hashSet.add("abc");
        hashSet.add("Hello");
        hashSet.add(null);

        System.out.println(hashSet);

        hashSet.remove(20);
        System.out.println(hashSet);

        HashSet removalSet=new HashSet<>();
        removalSet.add("abc");
        removalSet.add(22);

        hashSet.removeAll(removalSet);
        System.out.println(hashSet);
//

        HashSet retainSet=new HashSet<>();
        retainSet.add(38);
        hashSet.retainAll(retainSet);
        System.out.println(hashSet);





    }
}
