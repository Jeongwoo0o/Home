package e_static;

/*
 *  static
 *      - 각 객체들끼리 공유
 *      - 메모리에 단 1개 생성
 * 
 *      - 객체 생성보다 먼저 생성
 */

public class Book {

    static int count = 0;

    Book(){
        count++;
        System.out.println("책 한권 생성");
    }
}
