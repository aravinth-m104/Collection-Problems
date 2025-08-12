package Set;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scan.nextLine();
        //System.out.println(str);
        String[] string = str.split("\\s+");
        System.out.println(Arrays.toString(string));
        Set<String> uniqueElements = new HashSet<>(List.of(string));

        System.out.println("Unique elements in String is "+ uniqueElements.size());
    }
}
