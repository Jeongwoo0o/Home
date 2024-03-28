package e_tabpane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelC extends JPanel {

	JButton btn;
	
	public PanelC() {
		btn = new JButton("확인");
		add(btn);
		
		setBackground(Color.magenta);
	}
}
