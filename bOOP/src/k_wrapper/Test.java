package k_wrapper;

/*
 *  [기본형 자료형] ->  [Wrapper 클래스]
 *  int                 Integer
 *  double              Double
 *  char                Character
 *  boolean             Boolean
 */

public class Test {
    public static void main(String[] args) {
        
        Object[] a = method();

        // 여기서 출력
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static Object[] method() {
        String  name    = "홍길동";
        int     age     = 30;
        double  height  = 180.99;

        Object[] a = new Object[3];
        
        a[0] = name;
        a[1] = age;     // 자동으로 int -> Integer 변환
        a[2] = height;  // 자동으로 double -> Double 변환

        return a;
    }
}


