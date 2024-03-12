package f_singleton;

/*
 *  목적 : DBConnect 객체가 1개 공유
 * 
 *  static -> static만 접근 가능
 */

public class DBConnect {

    static DBConnect con = null;

    private DBConnect() {
        System.out.println("디비연동");
    }
    
    public static DBConnect getInstance() {    // 맨 처음 단 한번만 객체 생성하고 싶을 때
        if(con == null) {
            con = new DBConnect();
        }
        return con;
    }
}
