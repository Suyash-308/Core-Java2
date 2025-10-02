package Collection_Framework._9_Map;

import java.util.Map;
import java.util.TreeMap;

public class Demo3TreeMap {
    public static void main(String[] args) {
        // Unique,Homogeneous,Sorting Order.
        Map map=new TreeMap<>();
        map.put(1,"Ram");
        map.put(2,null);
        map.put(3,90);
        map.put(12,"abc");
        map.put(1,"Updated");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.remove(1);
        System.out.println(map);
    }
}
