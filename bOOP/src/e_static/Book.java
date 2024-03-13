package e_static;

/*
 *  static
 *      - 각 객체들끼리 공유
 *      - 메모리에 단 1개 생성
 * 
 *      - 객체 생성보다 먼저 생성
 *      - 클래스명으로 접근
 */

public class Book {

    private static int count = 0;

    static {
        System.out.println("단 한번만 실행");
    }

    public Book(){
        count++;
        System.out.println("책 한권 생성");
    }


    // getter
    public static int getCount() {              // 밖으로 빼줌
        return count;
    }
}
