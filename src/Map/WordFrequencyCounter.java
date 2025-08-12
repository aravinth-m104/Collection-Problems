package Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        String str= "This is example of This statement";
        String[] word = str.split("\\s+");
        List<String> words = Arrays.asList(word);

        for(String str1: words){
            frequencyMap.put(str1,frequencyMap.getOrDefault(str1,0)+1);
        }

        for(String str1: frequencyMap.keySet()){
            System.out.println(str1+" "+frequencyMap.get(str1));
        }
    }
}
