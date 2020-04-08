package text;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class JPasswordTest1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPasswordTest1 frame = new JPasswordTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPasswordTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//			lblNewLabel.setText(new String(passwordField.getPassword()));
			lblNewLabel.setText(String.valueOf(passwordField.getPassword()));
				
			}
		});
		passwordField.setEchoChar('*');
		contentPane.add(passwordField, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}

}
