package l_collection;
import java.util.*;

public class Ex03_Set {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<String>();
        set.add("rabbit");
        set.add("fox");
        set.add("ant");
        set.add("dog");
        set.add("zebra");
        set.add("dog");

        System.out.println(set);
    }
}
