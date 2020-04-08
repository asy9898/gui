package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Keypad extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField txtInput;
	private JButton[] button = new JButton[9];
	
	public Keypad() {
		setTitle("키패트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		txtInput = new JTextField();
		txtInput.setFont(new Font("굴림",Font.BOLD,20));
		contentPane.add(txtInput,BorderLayout.NORTH);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(0,3));
		contentPane.add(btnPanel,BorderLayout.CENTER);
		
		for(int i=0; i<button.length;i++) {
			button[i] = new JButton((i+1)+"");
			button[i].addActionListener(this);
			btnPanel.add(button[i]);
			
		}
		
		
		
		add(contentPane);		
		pack();
	}
	
	
	

	public static void main(String[] args) {
	Keypad key = new Keypad();
		}
		
	




	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼이 눌러지면 해당 버튼의 텍스트값을 txtInput에 보여주기
		String str = e.getActionCommand();  // 눌러지는 버튼의 getText를 바로 str에 담는다?
		//txtInput에 보여주기
		
		txtInput.setText(txtInput.getText()+str);
		
		
		
		
		
//		JButton btn = (JButton)e.getSource();
//		JTextField op1 = txtInput;
//		for(int i=0;i<button.length;i++) {
//			if(btn==button[i]) {
//				op1.setText(op1.getText()+button[i].getText());
//			}
//		}
		
		
		
		
	}

}
