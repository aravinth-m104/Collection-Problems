package Set;

import java.util.*;

public class MissingInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,8,9,10);
        List<Integer> missing = new ArrayList<>();
        int n=10;
        Set<Integer> set = new HashSet<>(list);

        for (int i = 1; i <= n ; i++) {
            if(!set.contains(i)){
                missing.add(i);
            }
        }

        System.out.println("Number of missing elements:"+missing.size());
        System.out.println("Missing Elements:"+missing);
    }
}
