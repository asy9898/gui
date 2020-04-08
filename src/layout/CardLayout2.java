package layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CardLayout2 extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JPanel panel[];
	private JPanel panel_2;
	private JButton mainbtn1,mainbtn2,mainbtn3;
	
	
	public CardLayout2() {
		setTitle("Card Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		//상단에 보여줄 레이아웃 담당
		JPanel top = new JPanel();
		add(top,BorderLayout.NORTH);
		
		mainbtn1 = new JButton("첫번째");
		mainbtn2 = new JButton("두번째");
		mainbtn3 = new JButton("세번째");
		
		top.add(mainbtn1);
		top.add(mainbtn2);
		top.add(mainbtn3);
		
		//center에 보여줄 레이아웃 담당 - 카드 레아이웃 설정
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,191,255));
		panel_2.setLayout(new CardLayout());
		add(panel_2,BorderLayout.CENTER);
		getJPanel(3);
		
		//CardLayout contentPane에 생성된 JPanel 추가
		int i=1;
		for(JPanel p:panel) {
			panel_2.add(String.valueOf(i),p);
			i++;
		}
		
		//첫번째 카드에 보여줄 컴포넌트
		JButton btn1 = new JButton("첫번째 카드-첫번쨰 버튼");
		JRadioButton radio = new JRadioButton("대한민국");
		panel[0].setBackground(Color.CYAN);
		panel[0].add(btn1);
		panel[0].add(radio);
		
		//두번째 카드에 보여줄 컴포넌트
		JButton btn2 = new JButton("두번째 카드-두번쨰 버튼");
		panel[1].setBackground(Color.GREEN);
		panel[1].add(btn2);
		
		//세번째 카드에 보여줄 컴포넌트
		JButton btn3 = new JButton("세번째 카드-세번쨰 버튼");
		panel[2].setBackground(Color.ORANGE);
		panel[2].add(btn3);
		
		mainbtn1.addActionListener(this);
		mainbtn2.addActionListener(this);
		mainbtn3.addActionListener(this);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		CardLayout2 card = new CardLayout2();
		card.setVisible(true);
		
	}
	
	
	
	
	
	
	private JPanel[] getJPanel(int cnt) {
		panel = new JPanel[cnt];
		for(int i=0; i<panel.length;i++) {
			if(panel[i]==null) {
				panel[i]=new JPanel();
			}
		}
		return panel;
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton) e.getSource();
		
		JPanel p = (JPanel)getContentPane().getComponent(1);
		CardLayout card = (CardLayout) p.getLayout();
		
		if(btn == mainbtn1) {
			card.show(p,"1");
		}else if(btn == mainbtn2) {
			card.show(p,"2");
		}else if(btn == mainbtn3) {
			card.show(p,"3");
		}
		
		
		
	}

}
