package code.collections.compareObjects.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PairDemo {
    public static void main(String[] args) {

        List<Pair> pairs = new ArrayList<>();

        pairs.add(new Pair("John",13));
        pairs.add(new Pair("Zigmund",11));
        pairs.add(new Pair("Boris",7));
        pairs.add(new Pair("John",46));
        pairs.add(new Pair("Alex",25));
        pairs.add(new Pair("Elena",17));

        System.out.println(pairs);

       // Comparator<Pair> pairComparator = new PairComparator();

        Set<Pair> pairSet = new TreeSet<>(new PairComparator());
        pairSet.addAll(pairs);

        System.out.println(pairSet);




    }
}
