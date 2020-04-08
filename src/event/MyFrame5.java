package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MyFrame5 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnYellow,btnRed;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame5 frame = new MyFrame5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		
		JButton btnYellow = new JButton("노랑");
		btnYellow.addActionListener(this);
		panel.add(btnYellow);
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			}
		
		
		JButton btnRed = new JButton("빨강");
		btnRed.addActionListener(this);
		panel.add(btnRed);
			
	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnYellow) {
			contentPane.setBackground(Color.YELLOW);
//			panel.setBackground(Color.YELLOW);
		}else {
			contentPane.setBackground(Color.RED);
//			panel.setBackground(Color.RED);
			
		}
		
		
	}
}
