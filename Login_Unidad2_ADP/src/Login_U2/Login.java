package Login_U2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Login {

	private JFrame frame;
	private JTextField txtUsr1;
	private JPasswordField txtPw1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTit = new JLabel("Login Unidad II ADP");
		lblTit.setBounds(182, 13, 127, 16);
		frame.getContentPane().add(lblTit);
		
		JLabel lblUsr1 = new JLabel("Usuario");
		lblUsr1.setBounds(95, 71, 56, 16);
		frame.getContentPane().add(lblUsr1);
		
		JLabel lblPw1 = new JLabel("Clave");
		lblPw1.setBounds(95, 114, 56, 16);
		frame.getContentPane().add(lblPw1);
		
		txtUsr1 = new JTextField();
		txtUsr1.setBounds(270, 68, 116, 22);
		frame.getContentPane().add(txtUsr1);
		txtUsr1.setColumns(10);
		
		txtPw1 = new JPasswordField();
		txtPw1.setBounds(270, 111, 116, 22);
		frame.getContentPane().add(txtPw1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw  = txtPw1.getText();
				String usr = txtUsr1.getText();
				if (usr.equals("bien") && pw.equals("yo")) {
					txtPw1.setText(null);
					txtUsr1.setText(null);
					bienvenido H = new bienvenido();
					H.setVisible(true);
				}
				else {
					txtPw1.setText(null);
					txtUsr1.setText(null);
					JOptionPane.showMessageDialog(null, "Usuario o Clave Errado",
							"Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(198, 191, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 161, 404, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 42, 404, 2);
		frame.getContentPane().add(separator_1);
	}
}
