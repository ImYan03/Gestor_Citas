package Registro;

import java.awt.EventQueue;
import ToolsMethods.Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class JLogin implements Ventana{

	private JFrame frmSignIn;
	private JTextField txtLogin;
	private JPasswordField pwdAsdadasd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin window = new JLogin();
					window.frmSignIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.setResizable(false);
		frmSignIn.setTitle("Login");
		frmSignIn.getContentPane().setBackground(new Color(255, 255, 255));
		frmSignIn.setBounds(100, 100, 622, 404);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 4, 94));
		panel.setBounds(394, 0, 212, 365);
		frmSignIn.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewHere = new JLabel("New Here?");
		lblNewHere.setForeground(new Color(255, 255, 255));
		lblNewHere.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewHere.setBounds(42, 87, 147, 65);
		panel.add(lblNewHere);
		
		JLabel lblSignUp = new JLabel("Register and discover\r\n");
		lblSignUp.setToolTipText("");
		lblSignUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblSignUp.setBounds(25, 137, 147, 39);
		panel.add(lblSignUp);
		
		JLabel lblSignUp_1 = new JLabel("the best");
		lblSignUp_1.setToolTipText("");
		lblSignUp_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSignUp_1.setForeground(Color.WHITE);
		lblSignUp_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblSignUp_1.setBounds(143, 125, 147, 65);
		panel.add(lblSignUp_1);
		
		JLabel lblServiceWithUs = new JLabel(" service with us");
		lblServiceWithUs.setToolTipText("");
		lblServiceWithUs.setHorizontalAlignment(SwingConstants.LEFT);
		lblServiceWithUs.setForeground(Color.WHITE);
		lblServiceWithUs.setFont(new Font("Source Sans Pro", Font.PLAIN, 13));
		lblServiceWithUs.setBounds(65, 160, 147, 39);
		panel.add(lblServiceWithUs);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JSign SignUp = new JSign();
				SignUp.ShowVentana();
				frmSignIn.dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(3, 4, 94));
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(55, 207, 111, 33);
		panel.add(btnNewButton);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(43, 0, 193, 65);
		panel.add(lblOdomtotech);
		
		JLabel lblNewLabel = new JLabel("Login to Your Account");
		lblNewLabel.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 30));
		lblNewLabel.setBounds(46, 26, 358, 65);
		frmSignIn.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setBackground(new Color(0, 119, 182));
		btnNewButton_1.setBounds(94, 260, 212, 44);
		frmSignIn.getContentPane().add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(3, 4, 94));
		panel_1.setBounds(71, 108, 253, 44);
		frmSignIn.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(225, 5, 24, 34);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\profile.png"));
		
		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.LEFT);
		txtLogin.setMargin(new Insets(2, 6, 2, 2));
		txtLogin.setText("Username");
		txtLogin.setBorder(null);
		txtLogin.setBounds(0, 0, 255, 43);
		panel_1.add(txtLogin);
		txtLogin.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(3, 4, 94));
		panel_1_1.setBounds(71, 163, 253, 45);
		frmSignIn.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\padlock1.png"));
		lblNewLabel_1_1.setBounds(226, 9, 24, 29);
		panel_1_1.add(lblNewLabel_1_1);
		
		pwdAsdadasd = new JPasswordField();
		pwdAsdadasd.setText("asdadasd");
		pwdAsdadasd.setBorder(null);
		pwdAsdadasd.setBounds(0, 0, 253, 44);
		panel_1_1.add(pwdAsdadasd);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me?");
		chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		chckbxNewCheckBox.setRequestFocusEnabled(false);
		chckbxNewCheckBox.setRolloverEnabled(false);
		chckbxNewCheckBox.setBorder(null);
		chckbxNewCheckBox.setFocusable(false);
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setFont(new Font("Source Sans Pro", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(72, 221, 127, 23);
		frmSignIn.getContentPane().add(chckbxNewCheckBox);
		frmSignIn.setLocationRelativeTo(null);
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		frmSignIn.setVisible(true);
	}
}
