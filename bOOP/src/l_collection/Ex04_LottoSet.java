package l_collection;
import java.util.*;

public class Ex04_LottoSet {
    public static void main(String[] args) {
        
        Set lottos = new HashSet();

        while(lottos.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            lottos.add(num);
        }

        ArrayList list = new ArrayList(lottos);
        Collections.sort(list);
        System.out.println(list);
    }
}
