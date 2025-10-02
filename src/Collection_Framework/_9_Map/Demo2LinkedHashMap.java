package Collection_Framework._9_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2LinkedHashMap {
    public static void main(String[] args) {
        // Unique,Homogeneous,Heterogeneous,null(1),Insertion Order.
        Map map=new LinkedHashMap();
        map.put(20,43);
        map.put("suyash",308);
        map.put(null,"Ram");

        System.out.println(map);
    }
}
