package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {12,23,24,34,45,56};
        int target;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter target number");
        target= scan.nextInt();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                System.out.println("Indices:"+map.get(compliment)+","+i);
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println("No two numbers found.");
    }
}
