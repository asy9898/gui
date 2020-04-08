package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exam.RSP;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JCheckTest4 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JCheckBox btn1,btn2,btn3;
	private JLabel la1,la2,la3;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest4 frame = new JCheckTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JCheckTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn1 = new JCheckBox("사과");
		btn1.addItemListener(this);
		panel.add(btn1);
		
		btn2 = new JCheckBox("포도");
		btn2.addItemListener(this);
		panel.add(btn2);
		
		btn3 = new JCheckBox("오렌지");
		btn3.addItemListener(this);
		panel.add(btn3);
//		btn1.setIcon(new ImageIcon(RSP.class.getResource("/exam/rock.PNG")));
		la1 = new JLabel("New label");
		contentPane.add(la1);
		
		la2 = new JLabel("New label");
		contentPane.add(la2);
		
		la3 = new JLabel("New label");
		contentPane.add(la3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox box = (JCheckBox) e.getSource();
		
		if(box.isSelected()) {
			if(box==btn1) {
			la1.setIcon(new ImageIcon(getClass().getResource("apple.gif")));
			}else if(box==btn2) {
			la2.setIcon(new ImageIcon(getClass().getResource("grape.gif")));
			}else if(box==btn3) {
			la3.setIcon(new ImageIcon(getClass().getResource("orange.gif")));
			}
		}else {
			if(box==btn1) {
			la1.setIcon(null);
			}else if(box==btn2) {
				la2.setIcon(null);
			}else if(box==btn3) {
				la3.setIcon(null);
			}
		}
		
		
		
//		if(btn1.isSelected()) {
//			la1.setIcon(new ImageIcon(getClass().getResource("apple.gif")));
//		}else if (btn1.isSelected()==false) {
//			la1.setIcon(null);
//		}
//	
//		if(btn2.isSelected()) {
//			la2.setIcon(new ImageIcon(getClass().getResource("grape.gif")));
//		}else if (btn1.isSelected()==false) {
//			la2.setIcon(null);
//		}
//	
//		if(btn3.isSelected()) {
//			la3.setIcon(new ImageIcon(getClass().getResource("orange.gif")));
//		}else if (btn1.isSelected()==false) {
//			la3.setIcon(null);
//		}
		
		
	}

}
