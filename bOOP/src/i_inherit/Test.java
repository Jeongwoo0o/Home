package i_inherit;

public class Test {
    public static void main(String[] args) {
        
        // Umma u = new Umma();
        // u.gene();
        // u.job();

        // Ddal d = new Ddal();
        // d.gene();
        // d.study();
        // d.job();

        // ** 부모 변수에 자식 객체 생성
        // Umma u2 = new Ddal();
        // u2.job();
        // u2.study();
        //***********
        // u2.gene();      // overriding된 메소드.(무조건 자식클래스 부름)

        // ** 자식 변수에 부모 객체?
        // Ddal d2 = new Umma();

        // (casting) 연산자
        // 1) 기본형끼리
        // 2) 상속관계끼리
        Umma u = new Umma();
        Ddal d = (Ddal)u;

        Ddal d2 = new Ddal();
        Umma u2 = (Umma)d2;

        // String s = new String("abc");
        // StringBuffer sb = (String)s;
    }
}


/*
 *  int a = 100;        (O)
 * 
 *  double b = 3.6;     (O)
 *  
 *  double c = 100;     (O)
 * 
 *  int d = 3.6;        (X)
 *  int d = (int)3.6;
 */