package i_inherit2;

/*
 *  this : 현재 객체의 레퍼런스(자기 자신)
 *  super : 부모 객체의 레퍼런스
 */

public class Book extends Item {

    String writer;
    String publisher;

    Book() {

    }

    Book(String num, String title, String writer, String publisher) {
        super.num = num;
        super.title = title;
        this.writer = writer;
        this.publisher = publisher;
    }

    void output() {
        System.out.println("번호 : " + num);
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + writer);
        System.out.println("출판사 : " + publisher);
    }
}
