package h_access;

/*
 *  접근지정자
 * 
 *  private : 다른 클래스에서 접근 안됨
 */

public class Access {
    
    private     String a = "프라이빗";
    public      String b = "퍼블릭";
    protected   String c = "프로텍티드";
                String d = "디폴트";

    public void output() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
