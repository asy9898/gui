package exam;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RSP extends JFrame implements ActionListener{
	
	private static final int ROCK=0;
	private static final int PAPER=1;
	private static final int SCISSOR=2;
	
	
	private JButton btn1,btn2,btn3;
	private JLabel label1;
	
	public RSP() {
		
		
		setTitle("가위 바위 보!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 500);
		setVisible(true);
//		btnRight.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/right.gif")));
		
		
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		label1 = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		topPane.add(label1);
		mainPane.add(topPane,BorderLayout.NORTH);
		
		JPanel centerPane = new JPanel();
		centerPane.setLayout(new GridLayout(0,3));
		btn1 = new JButton("ROCK");
		btn1.setIcon(new ImageIcon(RSP.class.getResource("/exam/rock.PNG")));
		btn1.addActionListener(this);
		btn2 = new JButton("PAPER");
		btn2.setIcon(new ImageIcon(RSP.class.getResource("/exam/paper.PNG")));
		btn2.addActionListener(this);
		btn3 = new JButton("SCISSOR");
		btn3.setIcon(new ImageIcon(RSP.class.getResource("/exam/scissor.PNG")));
		btn3.addActionListener(this);
		
		centerPane.add(btn1);
		centerPane.add(btn2);
		centerPane.add(btn3);
		
		mainPane.add(centerPane,BorderLayout.CENTER);
		
		
		getContentPane().add(mainPane);
		pack();
//		System.out.println(btn1.getText());
		
	}
	
	

	public static void main(String[] args) {
		RSP rsp = new RSP();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		//컴퓨터의 가위 바위 보 생성하
		Random random = new Random();
//		random.nextInt(3) : 괄호안의 숫자는 미포함 해서 0,1,2 중에서 나오게 함
		int computer = random.nextInt(3);
		
		if(computer==ROCK&&btn==btn1) {
			label1.setText("비김");
		}else if(computer==PAPER&&btn==btn1) {
			label1.setText("졌네!");
		}else if (computer==SCISSOR&&btn==btn1) {
			label1.setText("이겼다!");
		}else if(computer==ROCK&&btn==btn2) {
			label1.setText("이겼다!");
		}else if(computer==PAPER&&btn==btn2) {
			label1.setText("비김");
		}else if(computer==SCISSOR&&btn==btn2) {
			label1.setText("졌네!");
		}else if(computer==ROCK&&btn==btn3) {
			label1.setText("졌네!");
		}else if(computer==PAPER&&btn==btn3) {
			label1.setText("이겼다!");
		}else if(computer==SCISSOR&&btn==btn3) {
			label1.setText("비김");
		}
//		
//		String user = e.getActionCommand();
//		if(user.contentEquals("ROCK")) {
//			if(computer==ROCK) {
//				label1.setText("비겼다!");
//				//... . . . . .. 
//			}
//			
//		}else if (user.equals("PAPER")) {
//			
//		}else if (user.equals("SCISSOR")) {
//			
//		}
		
		
		
		
		
		
		// 너무 많은 코딩을 필요로함. 단축 필요.
			
			
		
		
		
		
		
		
		//시작시 하나의 랜덤한 값을 정하고 사용자가 낸 값에 따라 기존의 값과 비교하여 승 , 패 여부 JLabel에 나타내기
//		int a = (int) (Math.random()*3+1);
//		
//		if(a>btn1) {
//			
//			
//		}else if{ 
//			
//		}else {
//			
//		}
		
		
		
		
	}

}
