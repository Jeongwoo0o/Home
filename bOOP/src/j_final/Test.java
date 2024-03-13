package j_final;

/*
 *  fianl : 변경 불가
 * 
 *      ` final field   : 상수
 *      ` final method  : overriding 못하게
 *      ` final class   : 부모 클래스 안됨
 */

class Parent {
    final String field = "부모님꺼";
    final public void jib() {
        System.out.println("부모님이 만드신 집");
    }
}

class Child extends Parent {
    public Child() {
        // field = "내꺼";
    }
    // public void jib() {
    //     System.out.println("물러받아 탕진");       
    // }
}

public class Test {
    public static void main(String[] args) {
        
        Parent p = new Child();
        System.out.println(p.field);
        p.jib();
    }
}
