package exam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyButton extends JButton{
	static int count= 0;
	int index;
	public MyButton(String str) {
		super(str);
		index=count++;
	}
	
}

public class Puzzle extends JFrame implements ActionListener{
	private JPanel mainPane,bottomPane,centerPane;
	private JLabel label;
	private MyButton btn[] = new MyButton[9];
	
	
	public Puzzle() {
		setTitle("퍼즐");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		//메인 Panel생성BorderLayout
		mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		//센터패널 생성 GridLayout
		centerPane = new JPanel();
		centerPane.setLayout(new GridLayout(0,3));
		//버튼 9개 생성하기 이름은 1~8 1개는 비워둠
		for(int i=0; i<btn.length-1; i++) {
			btn[i] = new MyButton((i+1)+"");
			btn[i].addActionListener(this);
			centerPane.add(btn[i]);
		}
		btn[8] = new MyButton("");
		btn[8].addActionListener(this);
		centerPane.add(btn[8]);
		mainPane.add(centerPane,BorderLayout.CENTER);
		//바텀패널 생성 배경색은 검정
		bottomPane = new JPanel();
		bottomPane.setBackground(Color.BLACK);
		//JLable 생성
		label = new JLabel("Reset");
		//글자색은 주황
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("굴림",Font.BOLD,20));
		bottomPane.add(label);
		mainPane.add(bottomPane,BorderLayout.SOUTH);
		add(mainPane);
//		pack();
	}
	
	
	
	
	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		MyButton b = (MyButton)e.getSource();
//		System.out.println(b);
		if(b.equals("")) return;
		if(b.index==7) {
			if(btn[8].getText().equals("")) {
				btn[8].setText(b.getText());
				b.setText("");
			}
		}if(b.index==8) {
			if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		}
		
		
		
		
		
		
		
		
		
		
		//생성된 버튼9개중 하나를 눌렀을때 상하좌우중 비어있는 버튼이 있다면 텍스트 변경 후 기존텍스트는 비어있는 공간으로
//		JButton btn1 = (JButton)e.getSource();
//		
//		for (int i=0; i<btn.length;i++) {
//			if(btn1==btn[i]&&btn[i]!=null) {
//				
//			}
//		}
		
		
		
	}

}
