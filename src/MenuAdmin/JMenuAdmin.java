package MenuAdmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JMenuAdmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuAdmin window = new JMenuAdmin();
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
	public JMenuAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(10, 59, 129));
		panel.setBounds(0, 0, 203, 452);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(10, 59, 129));
		panel_1.setBounds(33, 15, 135, 41);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(3, -11, 193, 65);
		panel_1.add(lblOdomtotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 60, 162, 3);
		panel.add(separator);
		
		JButton btnNewButton = new JButton("                Principal\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(18, 88, 167));
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(18, 88, 167));
		btnNewButton.setBorder(null);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setBounds(0, 88, 203, 59);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("                Citas\r\n");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(18, 88, 167));
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(18, 88, 167));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setBounds(0, 142, 203, 59);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("                Registro de Pacientes\r\n");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1_1.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1_1.setBackground(new Color(18, 88, 167));
			}
		});
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(18, 88, 167));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1.setBounds(0, 197, 203, 59);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("                Registro de Citas");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1_1_1.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1_1_1.setBackground(new Color(18, 88, 167));
			}
		});
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(new Color(18, 88, 167));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setFocusable(false);
		btnNewButton_1_1_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_1.setBounds(0, 253, 203, 59);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Configuracion");
		btnNewButton_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1_1_2.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1_1_2.setBackground(new Color(18, 88, 167));
			}
		});
		btnNewButton_1_1_2.setFocusPainted(false);
		btnNewButton_1_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_2.setBackground(new Color(18, 88, 167));
		btnNewButton_1_1_2.setBorder(null);
		btnNewButton_1_1_2.setFocusable(false);
		btnNewButton_1_1_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_2.setBounds(0, 393, 203, 59);
		panel.add(btnNewButton_1_1_2);
	}

}
