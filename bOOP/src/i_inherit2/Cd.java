package i_inherit2;

public class Cd extends Item {

    String singer;

    Cd() {

    }

    Cd(String num, String title, String singer) {
        super.num = num;
        super.title = title;
        this.singer = singer;
    }

    void output() {
        System.out.println("번호 : " + num);
        System.out.println("제목 : " + title);
        System.out.println("가수 : " + singer);
    }
}
