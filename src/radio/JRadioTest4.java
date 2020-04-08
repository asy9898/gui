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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;

public class JRadioTest4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btn1,btn2;
	private JRadioButton btncombo,btnpotato,btnbull;
	private JRadioButton btnpmang,btncheese,btnpapa,btnbacon;
	private JRadioButton btnsmall,btnmideum,btnlarge;
	private JLabel la1;
	private ButtonGroup group1,group2,group3;
	private int  totalprice;
	private String porder,torder,sorder;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public JRadioTest4() {
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
		
		btn1 = new JButton("주문");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				int result=0;
				if(porder==null) {
					JOptionPane.showConfirmDialog(getParent(), "피자 종류를 선택 하신 후 다시 시도해 주십시오.", 	"주문 오류", JOptionPane.WARNING_MESSAGE);
				}
				
				if(porder!=null) {
				result=JOptionPane.showConfirmDialog(getParent(),
						"주문내역\n피자 종류 : "+porder+"\n토핑 : "+torder+"\n크기 : "+sorder+"\n가격은 "+totalprice+"원 입니다. 주문하시겠습니까?",
						"피자 주문확인", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(result==0) {
					JOptionPane.showConfirmDialog(getParent(), "주문이 완료되었습니다.","결제",JOptionPane.CLOSED_OPTION);
				}else if (result!=0) {
					
					JOptionPane.showConfirmDialog(getParent(), "주문이 취소되었습니다.","결제",JOptionPane.CLOSED_OPTION);
				}
				}
				
			}
		});

		
//		if(btn==btn1) {
//			
//			JOptionPane.showConfirmDialog(getParent(),"주문내역\n종류 : "+group1.getSelection()+"\n토핑 : "+group2.getSelection()+"\n크기 : "+group3.getSelection()+"\n가격은 "+price+"원 입니다. 주문하시겠습니까?", "피자 주문확인", JOptionPane.DEFAULT_OPTION,null);
//		}
		panel_1.add(btn1);
		
		btn2 = new JButton("취소");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				
				if(btn==btn2) {
					group1.clearSelection();
					group2.clearSelection();
					group3.clearSelection();
					la1.setText("");
					porder=null;
					torder="없음";
					sorder="스몰";
					totalprice=0;
				}
			}
		});
		panel_1.add(btn2);
		
		la1 = new JLabel("");
		panel_1.add(la1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		btncombo = new JRadioButton("콤보 (15,0000원)");
		panel_2.add(btncombo);
		btncombo.addActionListener(this);
		
		btnpotato = new JRadioButton("포테이토(12,000원)");
		panel_2.add(btnpotato);
		btnpotato.addActionListener(this);
		
		btnbull = new JRadioButton("불고기(14,000원)");
		panel_2.add(btnbull);
		btnbull.addActionListener(this);
		
		group1 = new ButtonGroup();
		group1.add(btncombo);
		group1.add(btnpotato);
		group1.add(btnbull);
		
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnsmall = new JRadioButton("Small (+0 기본사이즈 )");
		panel_3.add(btnsmall);
		btnsmall.addActionListener(this);
		
		btnmideum = new JRadioButton("Mideum (+2000)");
		panel_3.add(btnmideum);
		btnmideum.addActionListener(this);
		
		btnlarge = new JRadioButton("Large (+5000)");
		panel_3.add(btnlarge);
		btnlarge.addActionListener(this);
		
		group2 = new ButtonGroup();
		group2.add(btnsmall);
		group2.add(btnmideum);
		group2.add(btnlarge);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnpmang = new JRadioButton("피망 (+500)");
		panel_4.add(btnpmang);
		btnpmang.addActionListener(this);
		
		btncheese = new JRadioButton("치즈 (+1500)");
		panel_4.add(btncheese);
		btncheese.addActionListener(this);
		
		btnpapa = new JRadioButton("페페로니 (+1000)");
		panel_4.add(btnpapa);
		btnpapa.addActionListener(this);
		
		btnbacon = new JRadioButton("베이컨 (+2000)");
		panel_4.add(btnbacon);
		btnbacon.addActionListener(this);
		
		group3 = new ButtonGroup();
		group3.add(btnpmang);
		group3.add(btncheese);
		group3.add(btnpapa);
		group3.add(btnbacon);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		int price=0;
		
		if(btncombo.isSelected()) {
			price += 15000;
			porder="콤보 피자";
		}else if (btnpotato.isSelected()) {
			price += 12000;
			porder="포테이토 피자";
		}else if (btnbull.isSelected()) {
			price += 14000;
			porder="불고기 피자";
		}
		
		if(btnpmang.isSelected()) {
			price+= 500;
			torder="피망";
		}else if(btncheese.isSelected()) {
			price+= 1500;
			torder="치즈";
		}else if(btnpapa.isSelected()) {
			price+= 1000;
			torder="페페로니";
		}else if(btnbacon.isSelected()) {
			price+= 2000;
			torder="베이컨";
		}
		
		if(btnsmall.isSelected()) {
			price+= 0;
			sorder="스몰";
		}else if(btnmideum.isSelected()) {
			price+= 2000;
			sorder="미디움";
		}else if(btnlarge.isSelected()) {
			price+= 5000;
			sorder="라지";
		}
		
		totalprice = price;
		
		
		la1.setText("주문 금액 : "+totalprice+"원");
		
	}

}
