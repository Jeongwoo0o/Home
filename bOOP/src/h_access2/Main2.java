package h_access2;
import h_access2.sub.Access;

public class Main2 extends Access { // Access : 부모, Main2 : 자식
    public static void main(String[] args) {
        Main2 me = new Main2();
        // me.a = "프라이빗 수정";
        me.b = "퍼블릭 수정";
        me.c = "프로텍티드 수정";
        // me.d = "디폴트 수정";

        me.output();
    }
}
