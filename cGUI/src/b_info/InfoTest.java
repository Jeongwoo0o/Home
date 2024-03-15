package b_info;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/*
    ActionEvent : 자주 사용하는 이벤트 묶음
        
        ` 버튼 클릭 시
        ` 메뉴아이템 클릭 시
        ` 리스트 더블클릭 시
        ` 텍스트필드에서 엔터쳤을 때
*/

public class InfoTest extends JFrame {

    // 1. 멤버 변수 선언
    JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
    JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
    JTextArea ta;

    // 2. 객체 생성
    InfoTest() {
        super("DBTest");
        // Button
        bAdd = new JButton("Add");
        bShow = new JButton("Show");
        bSearch = new JButton("Search");
        bDelete = new JButton("Delete");
        bCancel = new JButton("Cancel");
        bExit = new JButton("Exit");

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
        pWest.add(new JLabel("Name", JLabel.CENTER)); // 라벨 생성 및 가운데 정렬
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

    void eventProc() {
        // add 버튼이 눌렸을 때
        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "'Add'버튼눌렸습니다.");
            }
        });

        // show 버튼이 눌렸을 때
        bShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "'Show'버튼눌렸습니다.");
            }
        });

        // search 버튼이 눌렸을 때
        bSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "'Search'버튼눌렸습니다.");
            }
        });

        // delete 버튼이 눌렸을 때
        bDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "'Delete'버튼눌렸습니다.");
            }
        });

        // cancel 버튼이 눌렸을 때
        bCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearTexts();
            }
        });

        // exit 버튼이 눌렸을 때
        bExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // ID 입력창에서 엔터쳤을 때 성별, 나이, 출신지 자동 입력
        tfId.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = tfId.getText();

                Calendar c = Calendar.getInstance(); // Calendar 불러오기
                int year = c.get(Calendar.YEAR); // 년 불러오기

                String gen_str = id.substring(7, 8); // 성 가져오기
                String city_str = id.substring(8, 9); // 출신지 가져오기
                String nai_str = id.substring(0, 2); // 90 가져오기
                int nai = Integer.parseInt(nai_str); // String -> int 형 변환 ("90" -> 90)

                int age = 0;
                switch (gen_str) {
                    case "0":
                    case "9":
                    case "1":
                    case "2":
                        String s_age = Integer.toString(age = year - (1900 + nai) + 1); // 나이 구해서 int -> String 형 변환
                        tfAge.setText(s_age);
                        break; // 한국 나이 구하기
                    case "3":
                    case "4":
                        s_age = Integer.toString(age = year - (2000 + nai) + 1);
                        tfAge.setText(s_age);
                        break; // 한국 나이 구하기 (2000년생 이후)
                } // end switch(age)

                switch (gen_str) {
                    case "1":
                    case "3":
                    case "9":
                        tfSex.setText("남자");
                        break;
                    case "2":
                    case "4":
                    case "0":
                        tfSex.setText("여자");
                        break;
                } // end switch(gender)

                switch (city_str) {
                    case "0":
                        tfHome.setText("서울");
                        break;
                    case "1":
                        tfHome.setText("인천");
                        break;
                    case "4":
                        tfHome.setText("대전");
                        break;
                } // end switch(city)

            }
        });
    } // end eventProc()

    void clearTexts() {
        tfName.setText(""); // 입력칸 초기화
        tfId.setText("");
        tfTel.setText("");
        tfSex.setText("");
        tfAge.setText("");
        tfHome.setText("");
        ta.setText("");
    } // end clearTexts()

    public static void main(String[] args) {

        InfoTest test = new InfoTest();
        test.addLayout();
        test.eventProc();
    }
}
