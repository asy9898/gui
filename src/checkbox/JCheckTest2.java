package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class JCheckTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JCheckBox box1,box2,box3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest2 frame = new JCheckTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JCheckTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		box1 = new JCheckBox("사과");
		box1.addItemListener(this);
		panel_1.add(box1);
		
		box2 = new JCheckBox("복숭아");
		box2.addItemListener(this);
		panel_1.add(box2);
		
		box3 = new JCheckBox("포도");
		box3.addItemListener(this);
		panel_1.add(box3);
		
		textArea = new JTextArea();
		panel.add(textArea);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 각 체크박스가 체크되면 체크된 과일의 이름을 textArea 보여주기
		//체크가 해제되면 textArea에 있던 과일의 이름은 삭제해주기
		//textArea => setText(), append()
		JCheckBox box = (JCheckBox) e.getSource();
//		String str = textArea.getText();
		
		
		
		if(box.isSelected()) {
			textArea.append(box.getText());
			
		}else {
			String str = textArea.getText();
			String delTxt = box.getText();
			StringBuffer buf = new StringBuffer(str);
			int start = buf.indexOf(delTxt);
			int end= start+delTxt.length();
			buf.delete(start, end);
			textArea.setText(buf.toString());
		}
		
		
		
//		if(box.isSelected()) {
//			textArea.append(box.getText());
//			str = textArea.getText();
//		}
//		else if(box.isSelected()==false){
//			if(box == box1) {
//				textArea.setText(str.replace("사과",""));
//			}else if(box == box2) {
//				textArea.setText(str.replace("복숭아",""));
//			}else if(box == box3) {
//				textArea.setText(str.replace("포도",""));
//			}
//			
//			
//			
//		}
		
		
	}

}
