package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;

public class JRadioTest5 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JRadioButton btncombo,btnpotato,btnbull;
	private JRadioButton btnpmang,btncheese,btnpapa,btnbacon;
	private JRadioButton btnsmall,btnmideum,btnlarge;
	private JButton btn1,btn2;
	private JLabel la1;

	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest5 frame = new JRadioTest5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public JRadioTest5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblNewLabel_1.setForeground(new Color(0, 153, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btn1 = new JButton("주문");
		panel_1.add(btn1);
		
		btn2 = new JButton("취소");
		panel_1.add(btn2);
		
		la1 = new JLabel("");
		panel_1.add(la1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		btncombo = new JRadioButton("콤보");
		panel_2.add(btncombo);
		btncombo.addItemListener(this);
		
		btnpotato = new JRadioButton("포테이토");
		panel_2.add(btnpotato);
		btnpotato.addItemListener(this);
		
		btnbull = new JRadioButton("불고기");
		panel_2.add(btnbull);
		btnbull.addItemListener(this);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(btncombo);
		group1.add(btnpotato);
		group1.add(btnbull);
		
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnsmall = new JRadioButton("Small");
		panel_3.add(btnsmall);
		btnsmall.addItemListener(this);
		
		btnmideum = new JRadioButton("Mideum");
		panel_3.add(btnmideum);
		btnmideum.addItemListener(this);
		
		btnlarge = new JRadioButton("Large");
		panel_3.add(btnlarge);
		btnlarge.addItemListener(this);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(btnsmall);
		group2.add(btnmideum);
		group2.add(btnlarge);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnpmang = new JRadioButton("피망");
		panel_4.add(btnpmang);
		btnpmang.addItemListener(this);
		
		btncheese = new JRadioButton("치즈");
		panel_4.add(btncheese);
		btncheese.addItemListener(this);
		
		btnpapa = new JRadioButton("페페로니");
		panel_4.add(btnpapa);
		btnpapa.addItemListener(this);
		
		btnbacon = new JRadioButton("베이컨");
		panel_4.add(btnbacon);
		btnbacon.addItemListener(this);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(btnpmang);
		group3.add(btncheese);
		group3.add(btnpapa);
		group3.add(btnbacon);
		
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		
	int price =0;
	int price2 =0;
	JRadioButton radio = (JRadioButton) e.getItem();
	
	if(e.getStateChange()==ItemEvent.SELECTED) {
		if(radio == btncombo) {
			price+=15000;
		}else if(radio == btnpotato) {
			price+=12000;
		}else if (radio == btnbull) {
			price+=14000;
		}
		if (radio == btnpmang) {
			price2+=500;
			price+=price2;
		}
	}
//	else {
//		if(radio == btncombo) {
//			price-=15000;
//		}else if(radio == btnpotato) {
//			price-=12000;
//		}else if (radio == btnbull) {
//			price-=14000;
//		}
		
		la1.setText("주문 금액 : "+price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	if(btncombo.isSelected()) {
//		price = 15000;
//	}else if (btnpotato.isSelected()) {
//		price = 12000;
//	}else if (btnbull.isSelected()) {
//		price = 14000;
//	}
//	
//	if(btnpmang.isSelected()) {
//		price+= 500;
//	}else if(btncheese.isSelected()) {
//		price+= 1500;
//	}else if(btnpapa.isSelected()) {
//		price+= 1000;
//	}else if(btnbacon.isSelected()) {
//		price+= 2000;
//	}
//	
//	if(btnsmall.isSelected()) {
//		price+=0;
//	}else if(btnmideum.isSelected()) {
//		price+= 2000;
//	}else if(btnlarge.isSelected()) {
//		price += 5000;
//	}
//	
//	la1.setText(price+"");
//		}
		


}
