package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;

public class KeyEvent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyEvent frame = new KeyEvent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("문자를 입력하시오");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				//키보드에서 키를 누를때 발생하는 이벤트
				System.out.println(e.getKeyCode());
				System.out.println(e.getKeyChar());
				int keyCode = e.getKeyCode();
				System.out.println(java.awt.event.KeyEvent.getKeyText(keyCode));
//				System.out.println();
				if(keyCode>=65 && keyCode<91||keyCode>=97&&keyCode<123) {
					textArea.setText("영어입니다");
				}else if(keyCode==8||keyCode==10){ 
					textArea.setText(textArea.getText());
				}else {
					textArea.setText("영어가 아닙니다");
				}
				
			}
		
		});
		panel.add(textField);
		textField.setColumns(10);
		
	}

}
