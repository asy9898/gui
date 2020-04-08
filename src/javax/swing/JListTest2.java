package javax.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.border.EmptyBorder;

public class JListTest2 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest2 frame = new JListTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JListTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		Vector<String> vector = new Vector<String>();
//		vector.add("런던");
//		vector.add("파리");
//		vector.add("홍콩");
//		vector.add("시드니");
//		vector.add("로스앤젤리스");
		
		//String datas[] = {"파리","런던","시드니","로스앤젤리스"};
		
		
		
		JList<String> list = new JList<String>(new DefaultListModel<String>() {
			String datas[] = {"파리","런던","시드니","로스앤젤리스"};
			@Override
			public String getElementAt(int index) {
				return datas[index];
			}
			@Override
			public int getSize() {
				return datas.length;
			}
		});
		contentPane.add(list,BorderLayout.CENTER);
		
		
		
		
	}

}
