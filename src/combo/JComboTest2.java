package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JComboTest2 extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> combo;
	private JTextField field;
	private Vector<String> vector;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest2 frame = new JComboTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JComboTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//콤보박스에 들어갈 아이템 설정
		
//		JComboBox<String> combo = new JComboBox<String>();
//		String[] items = {"월","화","수","목","금","토","일"};
//		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
//		combo.setModel(model);
		
		//Vector 이용
		vector = new Vector<>();
		vector.add("사과");
		vector.add("배");
		vector.add("복숭아");
		vector.add("딸기");
		vector.add("바나나");
		vector.add("귤");
		field = new JTextField();
		contentPane.add(field,BorderLayout.NORTH);
		combo = new JComboBox<String>(vector);
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> com = (JComboBox<String>) e.getSource();
				
				if(com.isEnabled()) {
					field.setText(combo.getSelectedItem()+"");
				}
			}
		});
		combo.setSelectedIndex(-1); // = 0번째에서 시작 2번째 (복숭아)가 디폴트로 선택되어있음.  -1로 값을 설정하면 아무것도 선택안된상태로 디폴트값을 설정함.
		contentPane.add(combo,BorderLayout.SOUTH);
	}
}
