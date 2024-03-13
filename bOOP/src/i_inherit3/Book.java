package i_inherit3;

/*
 *  this : 현재 객체의 레퍼런스(자기 자신), 실행 코드의 첫 줄에 와야함
 *  super : 부모 객체의 레퍼런스
 * 
 *  this() : 다른 생성자 함수를 호출할 때
 *  super() : 부모의 다른 생성자 함수를 호출할 때
 */

public class Book extends Item {

    String writer;
    String publisher;

    Book() {
        // num = "0000";
        // title = "제목없음";
        // writer = "미상";
        // publisher = "미출판사";
        this("0000", "제목없음", "미상", "미출판사");
        System.out.println("자식 기본생성자");
    }

    Book(String num, String title, String writer, String publisher) {
        // super.num = num;
        // super.title = title;
        super(num, title);
        this.writer = writer;
        this.publisher = publisher;
        System.out.println("자식 인자생성자");
    }

    // 오버라이딩 필수
    public void output() {
        System.out.println("번호 : " + num);
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + writer);
        System.out.println("출판사 : " + publisher);
    }
}
