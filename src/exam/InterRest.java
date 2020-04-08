package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterRest extends JFrame implements ActionListener{
	private JButton btn1;
	private JTextField text1,text2,text3;
	
	public InterRest() {
		setTitle("이자계산기");
		setSize(350, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		
		JLabel seed = new JLabel("원금을 입력하시오.");
		text1 = new JTextField(10);
		text1.addActionListener(this);
		topPane.add(seed);
		topPane.add(text1);
		mainPane.add(topPane,BorderLayout.NORTH);
		JPanel centerPane = new JPanel();
		JLabel eja = new JLabel("이율을 입력하시오.");
		text2 = new JTextField(10);
		text2.addActionListener(this);
		centerPane.add(eja);
		centerPane.add(text2);
		mainPane.add(centerPane,BorderLayout.CENTER);
		
		
		JPanel botoomPane = new JPanel();
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		text3 = new JTextField(20);
		text3.addActionListener(this);
		botoomPane.add(btn1);
		botoomPane.add(text3);
		mainPane.add(botoomPane,BorderLayout.SOUTH);
		
		
		add(mainPane);
		pack();
	}
	
	
	
	
	public static void main(String[] args) {
		InterRest test1 = new InterRest();
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		int op1 = Integer.parseInt(text1.getText());
		int op2 = Integer.parseInt(text2.getText());
		int result = 0;
		
		if(btn==btn1) {
			result += op1*op2*0.01;
			
		}
		text3.setText(result+"");
		
		
		
	}

}
