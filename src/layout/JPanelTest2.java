package layout;

import java.awt.BorderLayout;
import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelTest2 extends JFrame{
	
	public JPanelTest2() {
		setTitle("JPanelTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 150);
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		JLabel toplabel = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		topPane.add(toplabel,BorderLayout.CENTER);
		 mainPane.add(topPane,BorderLayout.NORTH);
		 
		 JPanel centerPane = new JPanel();
		 
		 JButton btn1 = new JButton("콤보피자");
		 JButton btn2 = new JButton("포테이토피자");
		 JButton btn3 = new JButton("불고기피자");
		 
		 centerPane.add(btn1);
		 centerPane.add(btn2);
		 centerPane.add(btn3);
		 
		 mainPane.add(centerPane,BorderLayout.CENTER);
		 
		 JPanel rightPane = new JPanel();
		 JLabel label2 = new JLabel("개수");
		 JTextField text = new JTextField(10);
		 centerPane.add(label2);
		 centerPane.add(text);
		 mainPane.add(centerPane,BorderLayout.EAST);
		
		
		add(mainPane);
		setVisible(true);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		JPanelTest2 test2 = new JPanelTest2();
		
		
	}

}
