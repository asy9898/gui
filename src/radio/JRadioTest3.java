package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class JRadioTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_2,rdbtnNewRadioButton_1;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("어떤 종류의 피자를 주문 하시겠습니까?");
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		rdbtnNewRadioButton = new JRadioButton("Small Size");
		panel_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton_1 = new JRadioButton("Mideum Size");
		panel_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(this);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Large Size");
		panel_2.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(this);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(25);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton rdo = (JRadioButton) e.getSource();
		if(rdo == rdbtnNewRadioButton) {
			textField.setText("Small Size를 고르셨습니다.");
		}else if(rdo == rdbtnNewRadioButton_1) {
			textField.setText("Mideum Size를 고르셨습니다.");
		}else if(rdo == rdbtnNewRadioButton_2) {
			textField.setText("Large Size를 고르셨습니다.");
		}
		
		
	}

}
