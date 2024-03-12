package f_singleton;

public class ScreenA {

    DBConnect con;
    
    public ScreenA() {
        // con = new DBConnect();
        con = DBConnect.getInstance();
    }

    public void use() {
        System.out.println("화면A 작업");
    }
}
