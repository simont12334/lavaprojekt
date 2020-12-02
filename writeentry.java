package lavaprojekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class writeentry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					writeentry frame = new writeentry();
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
	public writeentry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(78, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 56, 223, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIp = new JLabel("IP");
		lblIp.setBounds(78, 100, 46, 14);
		contentPane.add(lblIp);
		
		JLabel lblBeschreibung = new JLabel("Beschreibung");
		lblBeschreibung.setBounds(41, 143, 83, 14);
		contentPane.add(lblBeschreibung);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 97, 223, 20);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(160, 143, 223, 117);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Abbrechen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start s = new start();
				s.main(null);
			}
		});
		btnNewButton.setBounds(78, 300, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Erfassen");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				systemlogic s = new systemlogic();
				s.addentry(textField.getText(),textField_1.getText(),textArea.getText());
				hide();
			}
		});
		btnNewButton_1.setBounds(238, 300, 91, 23);
		contentPane.add(btnNewButton_1);
	}
}
