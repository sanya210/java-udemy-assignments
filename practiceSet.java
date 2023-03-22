package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class practiceSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // doesn't maintain insertion order, giving ascending order here but no guarantee
        Set<Integer> lset = new LinkedHashSet<>(); // maintains insertion order
        set.add(1);
        set.add(5);
        set.add(0);
        set.add(2);
        set.add(6);
        set.add(3);
        set.add(2);
        set.add(4);
        System.out.println(set);

        for(int i : set)
            System.out.println(i);

        Iterator<Integer> i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        lset.add(1);
        lset.add(5);
        lset.add(0);
        lset.add(2);
        lset.add(6);
        lset.add(3);
        lset.add(2);
        lset.add(4);
        System.out.println(lset);

        for(int j: lset)
            System.out.println(j);

    }
}
