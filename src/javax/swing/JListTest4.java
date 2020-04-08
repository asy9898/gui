package javax.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListTest4 extends JFrame implements ListSelectionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JList<String> list;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest4 frame = new JListTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JListTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 10, 0));
		
		list = new JList<>();
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(this);
		panel.add(list);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		panel.add(textArea);
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//ListSelectionEvent => 아이템을 선택하는 시점과 마우스에서 손을 때는 시점에 이벤트가 발생함.
//		JList<String> list1 = (JList<String>) e.getSource();
		if(e.getValueIsAdjusting()) {
			java.util.List<String> items= list.getSelectedValuesList();
			textArea.setText("");;
			for(String item:items) {
				textArea.append(items.toString());
			}
//			textArea.append(list.getSelectedValuesList()+"\n");
//		textArea.append(list.getSelectedValuesList()+"\n");
//		System.out.println(list.getSelectedValuesList());
		}
	}

}
