package Collection_Framework._9_Map;

import java.util.HashMap;
import java.util.Map;

public class Demo1HashMap {
    // Unique,Homogeneous,Heterogeneous,null(1).
    public static void main(String[] args){
        Map map=new HashMap<>();
        map.put(1,"Ram");
        map.put(null,30);
        map.put(2,3);
        map.put("a","abc");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.replace(1,"Suyash"));
        System.out.println(map);

    }
}
