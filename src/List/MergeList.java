package List;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(12,14,16,18,20));
        List<Integer> list2 = new ArrayList<>(List.of(13,15,17,19,21));
        List<Integer> mergedList = new ArrayList<>();

        int i=0, j=0;

        while (i< list1.size() && j< list2.size()) {
                if(list1.get(i) < list2.get(j)){
                    mergedList.add(list1.get(i++));
                }else{
                    mergedList.add(list2.get(j++));
                }
        }

        while(i<list1.size()){
            mergedList.add(list1.get(i++));
        }

        while(i<list2.size()){
            mergedList.add(list2.get(i++));
        }

        System.out.println("Merged List:"+mergedList);

    }
}
