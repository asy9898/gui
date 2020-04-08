package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioTest6 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest6 frame = new JRadioTest6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JRadioTest6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("버튼으로 라디오 버튼 클릭하기");
		contentPane.add(rdbtnNewRadioButton, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("클릭");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 누를 때 마다 라디오버튼의 선택 상태를 변화시키기
				JButton btn = (JButton) e.getSource();
				if(btn==btnNewButton) {
					rdbtnNewRadioButton.doClick();
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
