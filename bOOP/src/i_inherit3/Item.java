package i_inherit3;

//  추상 메소드를 가진 클래스 - 추상 클래스
public abstract class Item {

    protected String num;
    protected String title;

    public Item() {
        System.out.println("부모 기본생성자");
    }

    public Item(String num, String title) {
        this.num = num;
        this.title = title;
        System.out.println("부모 인자생성자");
    }

    // 구현없는 미완성 함수
    public abstract void output();
}
