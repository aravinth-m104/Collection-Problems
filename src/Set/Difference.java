package Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Difference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(23,34,45,26,27,76,78,56,34));
        Set<Integer> set2 = new HashSet<>(List.of(34,11,9,15,56,45,99,78,23));

        Set<Integer> merged = new HashSet<>(set1);
        merged.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        merged.removeAll(intersection);

        System.out.println("Different between two sets:"+merged);
    }
}
