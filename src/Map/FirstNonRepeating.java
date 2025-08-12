package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        String str= "This is example of This statement";
        for(char c: str.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c: frequencyMap.keySet()){
            if(frequencyMap.get(c)==1){
                System.out.println("First non repeating character: "+c);
                return;
            }
        }
    }
}
