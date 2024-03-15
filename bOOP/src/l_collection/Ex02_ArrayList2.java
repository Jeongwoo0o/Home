package l_collection;
import java.util.*;

public class Ex02_ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList<Student> list = method();
        
        // 출력
        // for(int i = 0; i < list.size(); i++) {
        //     Student s = (Student)list.get(i);
        //     System.out.println(s.toString());
        // }

        // 향상된 for 문 - 배열, list, set 집합 구조 + generics
        for(Student s : list) {
            System.out.println(s.toString());
        }

        // [참고] 순서대로 검색만 하는 구조
        // Enumeration -> Iterator
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    static ArrayList<Student>  method() {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("홍길동", 22));
        list.add(new Student("홍길자", 33));
        list.add(new Student("홍길순", 44));

        return list;
    }
}
