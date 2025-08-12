package List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(List.of(23,22,34,23,56,45,34,78,89));
        Set<Integer> set= new LinkedHashSet<>(list);
        List<Integer> uniqueList= new ArrayList<>(set);

        System.out.println("List After removing duplicates:"+uniqueList);
    }
}
