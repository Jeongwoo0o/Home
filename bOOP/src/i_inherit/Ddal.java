package i_inherit;

/*
 *  클래스 상속관계
 *  
 *  [ 개발시 관점 ]
 *  
 *      - 부모의 멤버를 사용
 *      - 부모의 멤버가 없으면 그냥 추가해서 사용
 *      - 부모의 멤버가 있는데 재정의(변경)
 *          --> 메소드명을 동일하게 구현
 *              인자와 리턴형이 동일
 *              cf) overriding
 * 
 *   cf) overloading
 * 
 * 
 *  [ 설계시 관점 ]
 *  
 *      - 클래스의 공통부분을 부모클래스 만들기
 *      - 클래스의 고유부분을 자식클래스 만들기
 */

public class Ddal extends Umma { 
    public Ddal() {
        System.out.println("자식클래스 생성");
    }
    
    public void gene() {
        System.out.println("자식은 자식");
    }

    public void study() {
        System.out.println("딸은 학생");
    }
}
