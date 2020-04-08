package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblNewLabel_1;
	private JTextField txtAge;
	private JLabel lblNewLabel_2;
	private JTextField txtGender;
	private JButton btnInput;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	private JButton button;
	private JButton btnDelete;
//	private Object data[];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest3 frame = new JTableTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTableTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("이름");
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(5);
		
		lblNewLabel_1 = new JLabel("나이");
		panel.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setColumns(5);
		panel.add(txtAge);
		
		lblNewLabel_2 = new JLabel("성별");
		panel.add(lblNewLabel_2);
		
		txtGender = new JTextField();
		txtGender.setColumns(5);
		panel.add(txtGender);
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(this);
		panel.add(btnInput);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		panel.add(btnDelete);
		
		button = new JButton("New button");
		panel.add(button);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//컬럼명 작성
		String columnName[]= {"이름","나이","성별"};
		model = new DefaultTableModel(columnName,0);
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		if(btn == btnInput) {
		// 사용자가 입력한 이름,나이,성별 가져오기
		String name = txtName.getText();
		String age = txtAge.getText();
		String gender = txtGender.getText();
		
		// 모델에 추가하기
		model = (DefaultTableModel) table.getModel();
//		Object data[] = {name,age,gender};
//		model.addRow(data);
		Vector<String> vec = new Vector<String>();
		vec.add(name);
		vec.add(age);
		vec.add(gender);
		model.addRow(vec);
		
		// 다른 데이터를 입력할 수 있도록 기존 데이터 삭제
		txtName.setText("");
		txtAge.setText("");
		txtGender.setText("");
		}else {
			int remove = table.getSelectedRow();
			
		model.removeRow(remove);
			
		}
		
		
	}

}
