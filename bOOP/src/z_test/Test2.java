package z_test;
import java.awt.Frame;

/*
 *  자바 상송관계
 *      - 단일 상속
 *      - 부모 클래스 무조건 1개
 */

public class Test2 extends Frame {

    // is-a 방식

    public Test2() {
        super("나의 두번째 창");
        setBounds(200, 300, 500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        Test2 t = new Test2();
    }
}
