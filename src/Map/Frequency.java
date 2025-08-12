package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        String str= "This is example of This statement";
        for(char c: str.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c: frequencyMap.keySet()){
            System.out.println(c+" "+frequencyMap.get(c));
        }
    }
}
