package chooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class JFileChooserTest1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnOpen;
	private JButton btnSave;
	private JFileChooser chooser;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					JFileChooserTest1 frame = new JFileChooserTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFileChooserTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("파일 선택기");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		btnOpen = new JButton("파일오픈");
		btnOpen.addActionListener(this);
		panel.add(btnOpen);
		
		btnSave = new JButton("파일저장");
		btnSave.addActionListener(this);
		panel.add(btnSave);
		chooser = new JFileChooser();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		
		if(btn == btnOpen) {
			
			int result = chooser.showOpenDialog(this);
			System.out.println(chooser.showOpenDialog(this));
			if(result==JFileChooser.APPROVE_OPTION) {
				System.out.println(chooser.getSelectedFile());
				System.out.println(result);
			}else {
				System.out.println("취소버튼 클릭");
			}
			
			
		}else {
			chooser.setDialogTitle("파일 저장");
			File f= new File("C:\\");
			chooser.setCurrentDirectory(f);
			
			// 파일 유형 추가하기
			FileNameExtensionFilter filter1 = new FileNameExtensionFilter("텍스트 파일 * txt", "txt");
			FileNameExtensionFilter filter2 = new FileNameExtensionFilter("이미지 파일 * png", "png");
			chooser.addChoosableFileFilter(filter1);
			chooser.addChoosableFileFilter(filter2);
			
		int result=chooser.showSaveDialog(this);
		if(result == JFileChooser.OPEN_DIALOG) {
			
		}else {
			
		}
		}
		
		
	}

}
