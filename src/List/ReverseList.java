package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of.elements:");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            list1.add(scan.nextInt());
        }
        System.out.println("Original List:"+list1);
        int left = 0;
        int right = list1.size()-1;
        while(left < right){
            int temp = list1.get(left);
            list1.set(left, list1.get(right));
            list1.set(right,temp);

            left++;
            right--;
        }

        System.out.println("Reversed List:"+list1);
    }
}
