package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelTest1 extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest1 frame = new JLabelTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JLabelTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("이미지를 보려면 버튼을 클릭하세요.");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		panel.add(lblNewLabel);
		
		JButton btnclick = new JButton("< 클릭 >");
		btnclick.addActionListener(this);
		panel.add(btnclick);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭시 라벨에 이미지 보여주기
		ImageIcon dog = new ImageIcon(getClass().getResource("pu.jpg"));
		lblNewLabel_1.setIcon(dog);
		
		
		
		
	}

}
