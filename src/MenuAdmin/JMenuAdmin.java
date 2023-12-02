package MenuAdmin;

import java.awt.EventQueue;
import ToolsMethods.Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import ToolsMethods.Tools;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JMenuAdmin implements Ventana {

	private static JMenuAdmin instanciaUnica = null;
	Tools T = new Tools();
	private JFrame frame;
	JPanel PanelDespliegue;
	JPanel contenedor, panelHome, panelAppoint,panelpatients,panelRegister;
	JLabel LblHome, lblPatients, lblAppointment, lblregister,FRegister,FRegisterAzul,FHome,FHomeAzul,FPatient,FPatientAzul,FAppoint, FAppointAzul;
	
	
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
	private JMenuAdmin() {
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
		
		contenedor = new JPanel(new BorderLayout());
		contenedor.setBounds(203, 0, 481, 452);
		frame.getContentPane().add(contenedor);
		
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
		
		JButton BtnConfig = new JButton("Settings\r\n");
		BtnConfig.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\setting.png"));
	
		BtnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowSettings();
			}
		});
		BtnConfig.setFocusPainted(false);
		BtnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnConfig.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnConfig.setForeground(new Color(255, 255, 255));
		BtnConfig.setBackground(new Color(10, 59, 129));
		BtnConfig.setBorder(null);
		BtnConfig.setFocusable(false);
		BtnConfig.setFocusTraversalKeysEnabled(false);
		BtnConfig.setBounds(0, 393, 203, 59);
		panel.add(BtnConfig);
		
		panelHome = new JPanel();
		panelHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowHome();
			}
		});
		panelHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHome.setBackground(new Color(10, 59, 129));
		panelHome.setBounds(-5, 87, 208, 54);
		panel.add(panelHome);
		panelHome.setLayout(null);
		
		FHome = new JLabel("");
		FHome.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\home.png"));
		FHome.setBounds(45, 4, 32, 43);
		panelHome.add(FHome);
		
		 FHomeAzul = new JLabel("");
		FHomeAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\home azul.png"));
		FHomeAzul.setBounds(45, 4, 32, 43);
		panelHome.add(FHomeAzul);
		
		LblHome = new JLabel("Home");
		T.pintarPanelYLabel(panelHome, LblHome,FHome, FHomeAzul);
		LblHome.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		LblHome.setForeground(new Color(255, 255, 255));
		LblHome.setBounds(79, 19, 46, 14);
		panelHome.add(LblHome);
		
		panelAppoint = new JPanel();
		panelAppoint.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowAppointment();
			}
		});
		panelAppoint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelAppoint.setBackground(new Color(10, 59, 129));
		panelAppoint.setBounds(-5, 140, 208, 54);
		panel.add(panelAppoint);
		panelAppoint.setLayout(null);
		
		FAppoint = new JLabel("");
		FAppoint.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\calendar.png"));
		FAppoint.setBounds(45, 5, 32, 43);
		panelAppoint.add(FAppoint);
		
		FAppointAzul = new JLabel("");
		FAppointAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\calendarAzul.png"));
		FAppointAzul.setBounds(45, 5, 32, 43);
		panelAppoint.add(FAppointAzul);
		
		lblAppointment = new JLabel("Appointment");
		T.pintarPanelYLabel(panelAppoint, lblAppointment, FAppoint, FAppointAzul);
		lblAppointment.setForeground(Color.WHITE);
		lblAppointment.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblAppointment.setBounds(79, 20, 106, 14);
		panelAppoint.add(lblAppointment);
		
		panelpatients = new JPanel();
		panelpatients.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ShowPatients();
			}
		});
		panelpatients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelpatients.setBackground(new Color(10, 59, 129));
		panelpatients.setBounds(-5, 193, 208, 54);
		panel.add(panelpatients);
		panelpatients.setLayout(null);
		
		FPatient = new JLabel("");
		FPatient.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\patient.png"));
		FPatient.setBounds(44, 5, 32, 43);
		panelpatients.add(FPatient);
		
		FPatientAzul = new JLabel("");
		FPatientAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\patientAzul.png"));
		FPatientAzul.setBounds(44, 5, 32, 43);
		panelpatients.add(FPatientAzul);
		
		lblPatients = new JLabel("Register Patients");
		T.pintarPanelYLabel(panelpatients, lblPatients, FPatient, FPatientAzul);
		lblPatients.setForeground(Color.WHITE);
		lblPatients.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblPatients.setBounds(78, 17, 187, 23);
		panelpatients.add(lblPatients);
		
		panelRegister = new JPanel();
		panelRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 ShowRegisterAppointment();
			}
		});
		panelRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelRegister.setBackground(new Color(10, 59, 129));
		panelRegister.setBounds(-5, 246, 208, 54);
		panel.add(panelRegister);
		panelRegister.setLayout(null);
		
		FRegister = new JLabel("");
		FRegister.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edit.png"));
		FRegister.setBounds(43, 5, 32, 43);
		panelRegister.add(FRegister);
		
		FRegisterAzul = new JLabel("");
		FRegisterAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\editAzul.png"));
		FRegisterAzul.setBounds(43, 5, 32, 43);
		panelRegister.add(FRegisterAzul);
		
		lblregister = new JLabel("Register Appointment");
		T.pintarPanelYLabel(panelRegister, lblregister ,FRegister, FRegisterAzul);
		lblregister.setForeground(Color.WHITE);
		lblregister.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblregister.setBounds(77, 20, 179, 14);
		panelRegister.add(lblregister);
		
		
			
	}
	

	
	void EliminarVentanas() {
		contenedor.removeAll();
		
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
	
	 public static  JMenuAdmin obtenerInstancia() {
	        if (instanciaUnica == null) {
	            instanciaUnica = new  JMenuAdmin();
	        }
	        return instanciaUnica;
	    }
	
	 public void ShowPatients() {
			EliminarVentanas();
			Pacientes p = new Pacientes(this);
			p.setBounds(203, 0, 481, 452);
			contenedor.add(p, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint(); 	
		}
		
		public void ShowHome() {
			EliminarVentanas();
			Home h = new Home();
			h.setBounds(203, 0, 481, 452);
			contenedor.add(h,  BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowAppointment() {
			EliminarVentanas();
			Citas c = new Citas();
			c.setBounds(203, 0, 481, 452);
			contenedor.add(c, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowRegisterAppointment() {
			EliminarVentanas();
			RegistrarCitas rg = new RegistrarCitas();
			rg.setBounds(0, 0, 481, 452);
			contenedor.add(rg, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
		
		public void ShowSettings() {
			EliminarVentanas();
			Config co = new Config();
			co.setBounds(0, 0, 481, 452);
			contenedor.add(co, BorderLayout.CENTER);
			contenedor.revalidate();
			contenedor.repaint();
		}
	
	@SuppressWarnings("deprecation")
	public void EnableWindows() {
		frame.enable();
	}
	
	@SuppressWarnings("deprecation")
	public void DisableWindows() {
		frame.disable();
	}
}
