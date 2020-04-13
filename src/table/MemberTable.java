package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import database.MemberDAO;
import database.MemberVO;

import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;

public class MemberTable extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;
	private MemberDAO dao;
	private DefaultTableModel model;
	private DefaultTableModel model1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberTable frame = new MemberTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MemberTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//DB객체 생성
		dao = new MemberDAO();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("회원 등록", null, panel, null);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("이름");
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("나이");
		panel.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		panel.add(txtAge);
		
		JLabel lblNewLabel_1_1 = new JLabel("성별");
		panel.add(lblNewLabel_1_1);
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		panel.add(txtGender);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("회원 조회", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("회원번호");
		panel_4.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("조회");
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JScrollPane scrollPane1 = new JScrollPane();
		model1=getModel();
		table = new JTable(model1);
		
		scrollPane1.setViewportView(table);
		
		
		panel_1.add(scrollPane1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("회원 수정", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
//		textField_1 = new JTextField();
//		textField_1.setText("수정할 회원 정보 입력");
//		panel_2.add(textField_1, BorderLayout.NORTH);
//		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("수정 할 회원 정보 입력");
		panel_2.add(lblNewLabel_4, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("수정");
		panel_2.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("번호");
		panel_5.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("나이");
		panel_5.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("회원 삭제", null, panel_3, null);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("회원번호");
		panel_3.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.addActionListener(this);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("회원전체 조회", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_6.add(scrollPane, BorderLayout.CENTER);
			
//		//membertbl의 전체 내용 가져오기
//		String columnNames[] = {"번호","이름","나이","성별"};
//		model = new DefaultTableModel(columnNames,0) {
//			
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				return false;
//			}
//		};
		
		table_1 = new JTable(getModel());
		list();
		
		
		scrollPane.setViewportView(table_1);
		
		//회원등록 화면의 성별
		txtGender.addActionListener(this);
	}
	
	public DefaultTableModel getModel() {
				String columnNames[] = {"번호","이름","나이","성별"};
				model = new DefaultTableModel(columnNames,0) {
					
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				return model;
	}
	
	
	
	public void list() {
		Vector<MemberVO> vec =dao.getList();
		
		//vec에 들어있는 값을 table에 보여주기
		for(MemberVO vo:vec) {
			Object[] objlist = {vo.getNo(),vo.getName(),vo.getAge(),vo.getGender()};
		model.addRow(objlist);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==txtGender) {
			//이름과 나이와 성별을 가져온 후 데이터 베이스에 입력하기
			MemberDAO dao = new MemberDAO();
			MemberVO vo = new MemberVO();
			vo.setNo(0);
			vo.setName(txtName.getText());
			vo.setAge(Integer.parseInt( txtAge.getText()));
			vo.setGender(txtGender.getText());
			
			int result=dao.insert(vo);
			if(result>0) {
				JOptionPane.showMessageDialog(this,"입력성공");
				model.setNumRows(0); // 기존모델 지우기
				list();
			}else {
				JOptionPane.showMessageDialog(this,"입력실패");
			}
			
		}else if (e.getActionCommand().equals("조회")) {
			int no = Integer.parseInt(textField.getText());
			MemberVO vo = new MemberVO();
			vo = dao.getRow(no);
			Object[] obj = {vo.getNo(),vo.getName(),vo.getAge(),vo.getGender()};
			model1.setNumRows(0);
			model1.addRow(obj);
		} else if (e.getActionCommand().equals("삭제")) {
			
			MemberDAO dao = new MemberDAO();
			int no = Integer.parseInt(textField_4.getText());
			int result = dao.delete(no);
			if(result>0) {
				JOptionPane.showMessageDialog(this, "삭제성공");
				dao.delete(no);
			textField_4.setText("");
			model.setNumRows(0);
			list();
			}else {
				
				JOptionPane.showMessageDialog(this, "삭제실패");
			}
		}
		System.out.println("원격 저장소 추가");
	}
}
