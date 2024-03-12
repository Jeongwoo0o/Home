package i_inherit;

/*
 *  private < default < protected < public
 */

public class Umma {
    public Umma() {
        System.out.println("부모클래스 생성");
    }

    public void gene() {
        System.out.println("부모는 부모");
    }

    public void job() {
        System.out.println("엄마는 대장");
    }
}
