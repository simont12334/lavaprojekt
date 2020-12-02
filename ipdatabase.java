package lavaprojekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ipdatabase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ipdatabase frame = new ipdatabase();
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
	public ipdatabase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(51, 153, 204));
		lblNewLabel.setBounds(44, 50, 142, 43);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(215, 49, 186, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(51, 153, 204));
		lblNewLabel_1.setBounds(44, 127, 142, 43);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(215, 127, 186, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if (e.getSource()==lblNewLabel_2) {
				
				systemlogic lg = new systemlogic();
				lg.checkpw(textField_1.getText(),textField_1.getText());
				hide();
			
			}	
				
			
			}
		
		});
		lblNewLabel_2.setIcon(new ImageIcon(ipdatabase.class.getResource("/lavaprojekt/icons8-rechts-eingekreist-80.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(146, 207, 142, 99);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
