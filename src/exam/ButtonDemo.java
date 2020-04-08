package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonDemo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnLeft,btnMiddle,btnRight;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonDemo frame = new ButtonDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ButtonDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnLeft = new JButton("Disable Middle Button");
		btnLeft.setMnemonic('D');
		btnLeft.setActionCommand("disable");
		btnLeft.addActionListener(this);
		btnLeft.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/left.gif")));
		panel.add(btnLeft);
		
		btnMiddle = new JButton("Middle Button");
		btnMiddle.setMnemonic('M');
		btnMiddle.setActionCommand("middle");
		btnMiddle.addActionListener(this);
		btnMiddle.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/middle.gif")));
		panel.add(btnMiddle);
		
		btnRight = new JButton("Enable Middle Button");
		btnRight.setMnemonic('E');
		btnRight.setActionCommand("enable");
		btnRight.addActionListener(this);
		btnRight.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/right.gif")));
		panel.add(btnRight);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource()  / e.getActionCommand
		String cmd = e.getActionCommand();
		if(cmd.equals("disable")) {
			btnMiddle.setEnabled(true);
			btnRight.setEnabled(true);
			btnLeft.setEnabled(false);
			
		}else {
			btnMiddle.setEnabled(false);
			btnRight.setEnabled(false);
			btnLeft.setEnabled(true);
			
			
		}
		
		
	}

}
