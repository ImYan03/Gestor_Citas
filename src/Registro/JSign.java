package Registro;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;

public class JSign {

	private JFrame frmSignUp;
	private JTextField textField;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSign window = new JSign();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JSign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setResizable(false);
		frmSignUp.getContentPane().setLocation(-287, -105);
		frmSignUp.getContentPane().setBackground(new Color(255, 255, 255));
		frmSignUp.setBounds(100, 100, 622, 404);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 180, 216));
		panel.setBounds(0, 0, 212, 365);
		frmSignUp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeBack = new JLabel("Welcome Back!");
		lblWelcomeBack.setForeground(Color.WHITE);
		lblWelcomeBack.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblWelcomeBack.setBounds(23, 96, 193, 65);
		panel.add(lblWelcomeBack);
		
		JLabel lblRegisterAndDiscover = new JLabel("If have you an Account");
		lblRegisterAndDiscover.setToolTipText("");
		lblRegisterAndDiscover.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegisterAndDiscover.setForeground(Color.WHITE);
		lblRegisterAndDiscover.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblRegisterAndDiscover.setBounds(44, 144, 147, 39);
		panel.add(lblRegisterAndDiscover);
		
		JLabel lblServiceWithUs_1 = new JLabel("Sign In!\r\n");
		lblServiceWithUs_1.setToolTipText("");
		lblServiceWithUs_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblServiceWithUs_1.setForeground(Color.WHITE);
		lblServiceWithUs_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblServiceWithUs_1.setBounds(83, 166, 147, 39);
		panel.add(lblServiceWithUs_1);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setFocusable(false);
		btnSignIn.setFocusTraversalKeysEnabled(false);
		btnSignIn.setFocusPainted(false);
		btnSignIn.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		btnSignIn.setBackground(new Color(0, 180, 216));
		btnSignIn.setBounds(55, 213, 106, 33);
		panel.add(btnSignIn);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(40, -2, 193, 65);
		panel.add(lblOdomtotech);
		
		JLabel lblCreateAccount = new JLabel("Create Account\r\n");
		lblCreateAccount.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 30));
		lblCreateAccount.setBounds(298, 23, 242, 65);
		frmSignUp.getContentPane().add(lblCreateAccount);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(3, 4, 94));
		panel_1.setBounds(287, 96, 253, 44);
		frmSignUp.getContentPane().add(panel_1);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setMargin(new Insets(2, 6, 2, 2));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(0, 0, 255, 43);
		panel_1.add(textField);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(3, 4, 94));
		panel_1_1.setBounds(287, 151, 253, 44);
		frmSignUp.getContentPane().add(panel_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setMargin(new Insets(2, 6, 2, 2));
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(0, 0, 255, 43);
		panel_1_1.add(txtEmail);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(3, 4, 94));
		panel_1_1_1.setBounds(287, 206, 253, 45);
		frmSignUp.getContentPane().add(panel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setText("asdadasd");
		passwordField.setBorder(null);
		passwordField.setBounds(0, 0, 253, 44);
		panel_1_1_1.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setBackground(new Color(0, 180, 216));
		btnNewButton_1.setBounds(312, 280, 204, 44);
		frmSignUp.getContentPane().add(btnNewButton_1);
	}
}
