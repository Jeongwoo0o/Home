package videoshop.view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EqualNameView extends JFrame {

	JTable table;
	JScrollPane scrollPane;
	
	String[] header = {"이름", "전화번호", "추가전화번호", "주소", "이메일"};
	String[][] contents = {};
	
	public EqualNameView() {
		addLayout();
		eventProc();
	}
	
	public void eventProc() {
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("e");
				
			}
		});
	}
	
	public void addLayout(){
		table	= new JTable(contents, header);
		scrollPane = new JScrollPane(table);
        add(scrollPane);
		
		
		setBounds(200, 200, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new EqualNameView();
		
	}
}
