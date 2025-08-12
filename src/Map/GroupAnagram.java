package Map;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        String[] str = {"ate","eat","tea","nun","bun","nat","ban","tan"};

        for(String word: str){
            char[] character = word.toCharArray();
            Arrays.sort(character);
            String key = new String(character);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
        }

        for (String str1: map.keySet()){
            System.out.println(map.get(str1));
        }
    }
}
