package button;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class JToggleTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JToggleButton tglbtnNewToggleButton;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest3 frame = new JToggleTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JToggleTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("토글버튼");
		tglbtnNewToggleButton.setFont(new Font("굴림", Font.PLAIN, 18));
		tglbtnNewToggleButton.addActionListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		btnNewButton = new JButton("그냥버튼");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		AbstractButton btn = (AbstractButton) e.getSource();
		
		
		
		if(btn==btnNewButton) {
			lblNewLabel.setText("일반버튼 클릭");
		}else if(btn.isSelected()) {
				lblNewLabel.setText("버튼 켜짐");
		}else {
				lblNewLabel.setText("버튼 꺼짐");
			}
			
		
		
		
		
	}


}
