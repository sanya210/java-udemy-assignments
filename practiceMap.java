package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class practiceMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(); // insertion order not maintained, gives in ascending key
        Map<Integer,String> lmap = new LinkedHashMap<>(); // insertion order maintained
        map.put(4,"Ginger");
        map.put(1,"Milk");
        map.put(5,"Sugar");
        map.put(2,"Tea leaves");
        map.put(3,"Water");

        lmap.put(4,"Ginger");
        lmap.put(1,"Milk");
        lmap.put(5,"Sugar");
        lmap.put(2,"Tea leaves");
        lmap.put(3,"Water");
        //gives ascending order
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(lmap);

        //for each method and using Entry interface
        for(Map.Entry<Integer,String> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());

        //key and value separately
        for(int i : map.keySet())
            System.out.println(i);
        for(String s : map.values())
            System.out.println(s);

        //similar to first for each but using iterator
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // for each action method
        map.forEach((k,v) -> System.out.println(k+" "+v));

        for(Map.Entry<Integer,String> entry : lmap.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
