package Set;

import java.util.*;

public class Common {
    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>(List.of("Rahul","Ravi","Velayudham","Vetrimaran","Jeeva"));
        List<String> name2 = Arrays.asList("Rajesh","Sakthi","Vetrimaran","Jeeva","Tamil");

        Set<String> set = new HashSet<>(name1);

        for(String s: name2){
            if(set.contains(s)){
                System.out.println("Elements found in list:" +s);
            }
        }

    }
}
