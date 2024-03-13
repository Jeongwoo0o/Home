package b_info;
import java.awt.*;
import javax.swing.*;

public class InfoTest2 extends JFrame{

    // 1. 멤버 변수 선언
    JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
    JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
    JTextArea ta;

    // 2. 객체 생성
    InfoTest2() {
        super("DBTest");
        // Button
        bAdd = new JButton("Add", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\1.png"));
        bShow = new JButton("Show", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\2.png"));
        bSearch = new JButton("Search", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\3.png"));
        bDelete = new JButton("Delete", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\4.png"));
        bCancel = new JButton("Cancel", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\5.png"));
        bExit = new JButton("Exit", new ImageIcon("C:\\xWork\\javaworkspace\\cGUI\\src\\images\\6.png"));

        // TextField
        tfName = new JTextField(15);
        tfId = new JTextField(15);
        tfTel = new JTextField(15);
        tfSex = new JTextField(15);
        tfAge = new JTextField(15);
        tfHome = new JTextField(15);

        // TextArea
        ta = new JTextArea(10, 200);
    }

    // 3. 화면 붙이기 및 출력
    void addLayout() {
        setLayout(new BorderLayout());

        // Label, TestField 출력
        JPanel pWest = new JPanel();
        pWest.setLayout(new GridLayout(6, 2));
        pWest.add(new JLabel("Name", JLabel.CENTER));   // 라벨 생성 및 가운데 정렬
        pWest.add(tfName);
        pWest.add(new JLabel("ID", JLabel.CENTER));
        pWest.add(tfId);
        pWest.add(new JLabel("Tel", JLabel.CENTER));
        pWest.add(tfTel);
        pWest.add(new JLabel("Sex", JLabel.CENTER));
        pWest.add(tfSex);
        pWest.add(new JLabel("Age", JLabel.CENTER));
        pWest.add(tfAge);
        pWest.add(new JLabel("Home", JLabel.CENTER));
        pWest.add(tfHome);
        add(pWest, BorderLayout.WEST);

        // Button 출력
        JPanel pSouth = new JPanel();
        pSouth.setLayout(new GridLayout(1, 6));
        pSouth.add(bAdd);
        pSouth.add(bShow);
        pSouth.add(bSearch);
        pSouth.add(bDelete);
        pSouth.add(bCancel);
        pSouth.add(bExit);
        add(pSouth, BorderLayout.SOUTH);

        // TestArea 출력
        add(ta);

        setBounds(300, 300, 1000, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        InfoTest2 test = new InfoTest2();
        test.addLayout();
    }
}
