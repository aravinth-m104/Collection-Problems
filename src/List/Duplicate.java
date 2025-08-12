package List;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of.elements:");
        int num = scan.nextInt();
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < num; i++) {
            list1.add(scan.nextInt());
        }

        for(int i : list1){
            if(!unique.add(i)){
                duplicate.add(i);
            }
        }

        System.out.println("List.Duplicate elements:"+duplicate);
    }
}
