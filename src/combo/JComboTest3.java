package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JComboTest3 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private String animal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest3 frame = new JComboTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JComboTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		label = new JLabel("",SwingConstants.CENTER);
		contentPane.add(label,BorderLayout.CENTER);
		
		String items[] = {"Bird","Cat","Dog","Pig","Rabbit"};
		JComboBox<String> combo = new JComboBox<String>(items);
		combo.setSelectedIndex(-1);
		combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox<String> combo2 = (JComboBox<String>) e.getSource();
				animal=(String) combo2.getSelectedItem();
				if(combo2.getSelectedItem()==animal) {
					updateIcon(animal);
				}
						
			}
		});
		contentPane.add(combo,BorderLayout.NORTH);
		
		
		
		
	}
	public void updateIcon(String animal) {
		label.setIcon(new ImageIcon(getClass().getResource(animal+".gif")));
		
	}

}
