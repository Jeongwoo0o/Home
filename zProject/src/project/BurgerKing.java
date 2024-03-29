import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class BurgerKing extends JFrame {
    EventView event;
    BurgerView burger;
    SideView side;
    DrinkView drink;

    public BurgerKing() {
        // 각각의 화면을 관리하는 클래스 객체 생성
        event = new EventView();
        burger = new BurgerView();
        side = new SideView();
        drink = new DrinkView();

        JTabbedPane pane = new JTabbedPane();
        pane.addTab("행사상품", event);
        pane.addTab("햄버거선택", burger);
        pane.addTab("사이드선택", side);
        pane.addTab("음료수선택", drink);

        pane.setSelectedIndex(0);

        // 화면크기지정!
        add("Center", pane);
        setBounds(300, 300, 800, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end BurgerKing()

    public static void main(String[] args) {
        new BurgerKing();
    }
}
