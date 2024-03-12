package g_innerclass;

class Outer {

    static class Inner {
        static void najaba() {
            System.out.println("잡아봐");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        
        // [1]
        // Outer o = new Outer();
        // Outer.Inner in = o.new Inner();
        // in.najaba();

        // [2] : Inner class에 static이 붙은 경우
        // Outer.Inner in = new Outer.Inner(); 
        // in.najaba();

        // [3] : Inner class안의 najaba에도 static이 붙은 경우
        Outer.Inner.najaba();
    }
}
