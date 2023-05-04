package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 876, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT BILL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(285, 50, 288, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(169, 137, 71, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(149, 203, 91, 46);
		frame.getContentPane().add(lblNewLabel_2);
		
		T1 = new JTextField();
		T1.setBounds(391, 220, 147, 29);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"select", "chicken biryani", "veg biryani"}));
		C1.setBounds(391, 137, 147, 29);
		frame.getContentPane().add(C1);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m=(String) C1.getSelectedItem();
				String q=T1.getText();
				int Q=Integer.parseInt(q);
				int bill=0;
				
				if(m.equals("chicken biryani"))
				{
					bill=Q*200;
					
				
					
					
				}
				else if(m.equals("veg biryani"))
				{
					bill=Q*100;
				}
				else 
				{
					JOptionPane.showMessageDialog(btnNewButton,"invalid");
				}
				JOptionPane.showMessageDialog(btnNewButton,"Thank you"+" \nyour order is on the way"+   "\nyour bill:"+bill);
				
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(336, 370, 119, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
