package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertMile extends JFrame implements ActionListener{
	private JTextField text1,text2;
	private JButton btn1;
	
	public ConvertMile() {
		setTitle("마일을 킬로미터로 변경");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		
		JPanel topPane = new JPanel();
		JLabel label = new JLabel("거리를 마일단위로 입력하세요");
		text1 = new JTextField(10);
		text1.addActionListener(this);
		
		
		topPane.add(label);
		topPane.add(text1);
		
		mainPane.add(topPane,BorderLayout.NORTH);
		
		JPanel centerPane = new JPanel();
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		centerPane.add(btn1);
		mainPane.add(centerPane,BorderLayout.CENTER);
		
		JPanel bottomPane = new JPanel();
		text2 = new JTextField(35);
		text2.addActionListener(this);
		bottomPane.add(text2);
		mainPane.add(bottomPane,BorderLayout.SOUTH);
		
		add(mainPane);
		pack();
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		ConvertMile test2 = new ConvertMile();
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		int op1 = Integer.parseInt(text1.getText());
		double result = 0;
		
		if(btn == btn1) {
			result = op1*1.609;
		}
		text2.setText(result+"");
		
		
	}

}
