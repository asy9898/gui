package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

//이벤트 처리를 위한 클래스를 외부 클래스로 작성하기
//class MyListener2 implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
//		System.out.println(e.getSource());
//		
//		//버튼위에 있는 글자를 변경
//	JButton btn = (JButton)e.getSource();
//	btn.setText("버튼이 눌러졌습니다.");
// 
//	
//		
//	}
//	
//}


public class MyFrame4 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JButton btn1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame4 frame = new MyFrame4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}//main 종료

	public MyFrame4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		btn1 = new JButton("버튼을 누르세요");
		
		panel.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//익명구현객체
				label.setText("버튼클릭");
				
			}
		});
		
		label = new JLabel("New label");
		panel.add(label);
	}
	
}
