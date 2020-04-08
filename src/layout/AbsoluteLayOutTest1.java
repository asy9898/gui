package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayOutTest1 extends JFrame {
	
	public AbsoluteLayOutTest1() {
		setTitle("AbsoluteLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//x좌표 , y좌표 , 컴퍼넌트x크기 , 컴퍼넌트y크기
		JButton btn1 = new JButton("사과");
		btn1.setBounds(33, 24, 97, 23);
		panel.add(btn1);
			
		JButton btn2 = new JButton("바나나");
		btn2.setBounds(297, 65, 97, 23);
		panel.add(btn2);
			
		JButton btn3 = new JButton("수박");
		btn3.setBounds(73, 180, 97, 23);
		panel.add(btn3);
		
		add(panel);
		
	}
	
	
	
	public static void main(String[] args) {
		AbsoluteLayOutTest1 absolute = new AbsoluteLayOutTest1();
		
		
	}

}
