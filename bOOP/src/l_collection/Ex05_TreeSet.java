package l_collection;

import java.util.Set;
import java.util.TreeSet;

public class Ex05_TreeSet {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        set.add("elephant");
        set.add("tiger");
        set.add("lion");
        set.add("cat");
        set.add("dog");
        set.add("dog");
        set.add("dog");
        set.add("zebra");
        set.add("bee");
        set.add("ant");
        set.add("snake");

        System.out.println(set);
        System.out.println(set.subSet("d", "t")); // d 부터 e 전까지
        System.out.println(set.headSet("e")); // e 전까지
        System.out.println(set.tailSet("e")); // e 부터
    }
}
