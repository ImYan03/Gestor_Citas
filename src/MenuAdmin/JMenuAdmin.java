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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenuAdmin {

	private JFrame frame;
	JPanel PanelDespliegue;
	
	Home h = new Home();
	Citas c = new Citas();
	Pacientes p = new Pacientes();
	RegistrarCitas rg = new RegistrarCitas();
	Config co = new Config();
	
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
		
		JButton BtnPrincipal = new JButton("                Principal\r\n");
		BtnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarVentanas();
				h.setBounds(203, 0, 481, 452);
				frame.getContentPane().add(h);
				frame.revalidate();
				frame.repaint();
			}
		});
		BtnPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnPrincipal.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnPrincipal.setBackground(new Color(18, 88, 167));
			}
		});
		BtnPrincipal.setFocusPainted(false);
		BtnPrincipal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPrincipal.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnPrincipal.setHorizontalAlignment(SwingConstants.LEADING);
		BtnPrincipal.setForeground(new Color(255, 255, 255));
		BtnPrincipal.setBackground(new Color(18, 88, 167));
		BtnPrincipal.setBorder(null);
		BtnPrincipal.setFocusable(false);
		BtnPrincipal.setFocusTraversalKeysEnabled(false);
		BtnPrincipal.setBounds(0, 88, 203, 59);
		panel.add(BtnPrincipal);
		
		JButton BtnCitas = new JButton("                Citas\r\n");
		BtnCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarVentanas();
				c.setBounds(203, 0, 481, 452);
				frame.getContentPane().add(c);
				frame.revalidate();
				frame.repaint();
			}
		});
		BtnCitas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnCitas.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnCitas.setBackground(new Color(18, 88, 167));
			}
		});
		BtnCitas.setFocusPainted(false);
		BtnCitas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnCitas.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnCitas.setHorizontalAlignment(SwingConstants.LEADING);
		BtnCitas.setForeground(new Color(255, 255, 255));
		BtnCitas.setBackground(new Color(18, 88, 167));
		BtnCitas.setBorder(null);
		BtnCitas.setFocusable(false);
		BtnCitas.setFocusTraversalKeysEnabled(false);
		BtnCitas.setBounds(0, 142, 203, 59);
		panel.add(BtnCitas);
		
		JButton BtnPacientes = new JButton("                Registro de Pacientes\r\n");
		BtnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarVentanas();
				p.setBounds(203, 0, 481, 452);
				frame.getContentPane().add(p);
				frame.revalidate();
				frame.repaint();
			}
		});
		BtnPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnPacientes.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnPacientes.setBackground(new Color(18, 88, 167));
			}
		});
		BtnPacientes.setFocusPainted(false);
		BtnPacientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPacientes.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnPacientes.setHorizontalAlignment(SwingConstants.LEADING);
		BtnPacientes.setForeground(new Color(255, 255, 255));
		BtnPacientes.setBackground(new Color(18, 88, 167));
		BtnPacientes.setBorder(null);
		BtnPacientes.setFocusable(false);
		BtnPacientes.setFocusTraversalKeysEnabled(false);
		BtnPacientes.setBounds(0, 197, 203, 59);
		panel.add(BtnPacientes);
		
		JButton BtnRegistro = new JButton("                Registro de Citas");
		BtnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarVentanas();
				rg.setBounds(203, 0, 481, 452);
				frame.getContentPane().add(rg);
				frame.revalidate();
				frame.repaint();
			}
		});
		BtnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnRegistro.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnRegistro.setBackground(new Color(18, 88, 167));
			}
		});
		BtnRegistro.setFocusPainted(false);
		BtnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnRegistro.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnRegistro.setHorizontalAlignment(SwingConstants.LEADING);
		BtnRegistro.setForeground(new Color(255, 255, 255));
		BtnRegistro.setBackground(new Color(18, 88, 167));
		BtnRegistro.setBorder(null);
		BtnRegistro.setFocusable(false);
		BtnRegistro.setFocusTraversalKeysEnabled(false);
		BtnRegistro.setBounds(0, 253, 203, 59);
		panel.add(BtnRegistro);
		
		JButton BtnConfig = new JButton("Configuracion");
		BtnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarVentanas();
				co.setBounds(203, 0, 481, 452);
				frame.getContentPane().add(co);
				frame.revalidate();
				frame.repaint();
			}
		});
		BtnConfig.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnConfig.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnConfig.setBackground(new Color(18, 88, 167));
			}
		});
<<<<<<< HEAD
		BtnConfig.setFocusPainted(false);
		BtnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnConfig.setHorizontalTextPosition(SwingConstants.CENTER);
		BtnConfig.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnConfig.setForeground(new Color(255, 255, 255));
		BtnConfig.setBackground(new Color(18, 88, 167));
		BtnConfig.setBorder(null);
		BtnConfig.setFocusable(false);
		BtnConfig.setFocusTraversalKeysEnabled(false);
		BtnConfig.setBounds(0, 393, 203, 59);
		panel.add(BtnConfig);
			
	}
	
	public void EliminarVentanas() {
		frame.remove(h);
		frame.remove(c);
		frame.remove(p);
		frame.remove(rg);
		frame.remove(co);
=======
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
		
>>>>>>> eaf237251ef15e82ef1584eb371f2e27c410c985
		
	}
}
