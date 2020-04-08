package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class JLabelTest2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JToggleButton tglbtnNewToggleButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest2 frame = new JLabelTest2();
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
	public JLabelTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("이미지를 보려면 버튼을 클릭하세요.");
		tglbtnNewToggleButton.addActionListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JToggleButton tgl = (JToggleButton) e.getSource();
		
		ImageIcon dog = new ImageIcon(getClass().getResource("dog.gif"));
		
		if(tgl.isSelected()) {
			lblNewLabel.setIcon(dog);
			lblNewLabel.setText("그림이 나타났어요");
			tgl.setText("이미지를 숨기려면 버튼을 클릭하세요.");
		}else {
			lblNewLabel.setIcon(null);
			lblNewLabel.setText("그림이 사라졌어요!");
			tgl.setText("이미지를 보려면 버튼을 클릭하세요.");
		}
		
	}

}
