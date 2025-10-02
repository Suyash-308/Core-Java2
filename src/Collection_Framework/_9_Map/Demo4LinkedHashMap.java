package Collection_Framework._9_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo4LinkedHashMap {
    public static void main(String[] args) {
        Map <Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Ram");
        map.put(24,"abc");
        map.put(21,"Shyam");
        map.put(90,"Mahakal");

       System.out.println(map.get(1));
       System.out.println(map.entrySet());


    }
}
