package MenuRegisters;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
<<<<<<< HEAD
import javax.swing.table.DefaultTableModel;

import ConexionBD.Conexion;
import MenuAdmin.JMenuAdmin;
import MenuShow.DoctorsShow;
import ToolsMethods.Tools;

=======
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
<<<<<<< HEAD
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
=======
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e

public class RegisterDoctor extends JPanel {

	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	private JTable DoctorTable;
	private JTextField Nametxt;
	private JTextField Emailtxt;
	private JTextField LastNametxt;
	private JTextField Phonetxt;
	@SuppressWarnings("unused")
	private JComboBox<?> comboBx_Especialidad;
	private JPanel panelDoctor,panelTable;
	Tools t = new Tools();
	private JMenuAdmin instanciaJMenuAdmin;
	/**
	 * Create the panel.
	 */
	public RegisterDoctor(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
=======
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public RegisterDoctor() {
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 481, 452);
		setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 64));
		separator_1.setBounds(10, 30, 461, 10);
		add(separator_1);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout(null);
		panelbotones.setBackground(new Color(251, 251, 251));
		panelbotones.setBounds(248, 30, 223, 229);
		add(panelbotones);
		
		JSeparator separadorbotones = new JSeparator();
		separadorbotones.setBackground(new Color(0, 0, 64));
		separadorbotones.setBounds(1, 226, 226, 10);
		panelbotones.add(separadorbotones);
		
<<<<<<< HEAD
		//ComboBox de Especialidad
		JComboBox<Object> comboBx_Especialidad = new JComboBox<Object>();
		t.CmbSpecialty(comboBx_Especialidad, "Especialidad", "Nombre");
		comboBx_Especialidad.setFocusable(false);
		comboBx_Especialidad.setFocusTraversalKeysEnabled(false);
		comboBx_Especialidad.setLightWeightPopupEnabled(false);
		comboBx_Especialidad.setBackground(UIManager.getColor("Button.background"));
		comboBx_Especialidad.setBounds(11, 83, 206, 22);
		
			// Estilizado del boton:		
=======
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		JButton btnSave = new JButton("Save");
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\diskette.png"));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBorderPainted(false);
<<<<<<< HEAD
		btnSave.setBackground(new Color(7, 43, 95));		
		btnSave.setBounds(10, 11, 203, 34);	
		panelbotones.add(btnSave);
		
			// Evento de Save: 
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Nametxt.getText().isEmpty()|| LastNametxt.getText().isEmpty()|| Emailtxt.getText().isEmpty()
					|| Phonetxt.getText().isEmpty()|| comboBx_Especialidad.getSelectedItem()==null) {
					
					JOptionPane.showMessageDialog( null, "Todos los campos deben ser completados");
				}else {
					try {
						String consulta = "Select * FROM Doctores Where Nombres = '" + Nametxt.getText()+"'";
						Statement sql = Conexion.EstablecerConexion().createStatement();
						ResultSet resultado = sql.executeQuery(consulta);
							if (resultado.next()) {
								String mensaje = "Ya existe esa persona en la base de datos";
								JOptionPane.showMessageDialog(null, mensaje);
							}
							else {
								String comboBox_Item = (String)comboBx_Especialidad.getSelectedItem();
									try {				
										Statement sql2 = Conexion.EstablecerConexion().createStatement();
										String consulta2 = "Insert into Doctores (Nombres,Apellido,Especialidad,Email,Telefono)values("
										
											+ "'" + Nametxt.getText()+"'," 	
											+ "'" + LastNametxt.getText()+"',"
											+ "'" + comboBox_Item + "',"
											+ "'" + Emailtxt.getText()+ "',"
											+ "'" + Phonetxt.getText() + "');";			
										
										sql2.executeUpdate(consulta2);
									}catch(SQLException ex) {	
										JOptionPane.showMessageDialog(null, ex.toString());
									}
							}						
					}catch(SQLException ex) {
						JOptionPane.showMessageDialog(null, ex.toString());
					}
			}
		}
	});
		 // Boton show
=======
		btnSave.setBackground(new Color(7, 43, 95));
		btnSave.setBounds(10, 11, 203, 34);
		panelbotones.add(btnSave);
		
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		JButton btnShow = new JButton("Show");
		btnShow.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\printer.png"));
		btnShow.setForeground(Color.WHITE);
		btnShow.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnShow.setFocusable(false);
		btnShow.setFocusTraversalKeysEnabled(false);
		btnShow.setFocusPainted(false);
		btnShow.setBorderPainted(false);
		btnShow.setBackground(new Color(7, 43, 95));
		btnShow.setBounds(10, 53, 203, 34);
		panelbotones.add(btnShow);
		
<<<<<<< HEAD
		// Panel que contiene la tabla
		panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBounds(10, 284, 461, 152);
		add(panelTable);	
				
		DefaultTableModel modelo = t.MostrarTabla("Doctores");
		
				// Tabla de muestra
				DoctorTable = new JTable(modelo);
				DoctorTable.setGridColor(UIManager.getColor("ScrollBar.background"));
				DoctorTable.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				DoctorTable.setBounds(0, 0, 439, 0);
				
				
				JScrollPane scrollPane = new JScrollPane(DoctorTable);
				scrollPane.setBounds(10, 11, 441, 130);
				panelTable.add(scrollPane);
						
		btnShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				DoctorsShow D = new DoctorsShow(instanciaJMenuAdmin);
				D.ShowVentana();
				
				try {
					Statement sql3 = Conexion.EstablecerConexion().createStatement();
					String consulta3 = "Select *from Doctores";
					
					ResultSet Datos_Doc = sql3.executeQuery(consulta3);
					
					// Esto es para la tabla de Preview inmediato
					int columnas = Datos_Doc.getMetaData().getColumnCount();
					for (int i = 1; i < columnas; i++ ) {
							modelo.addColumn(Datos_Doc.getMetaData().getColumnName(i));
						}
					while (Datos_Doc.next()) {
						Object[] nuevaFila = {Nametxt.getText(), LastNametxt.getText(), Emailtxt.getText(), Phonetxt.getText()};

						modelo.addRow(nuevaFila);
						modelo.fireTableDataChanged();
						t.LimpiarCampos(Nametxt,LastNametxt,Emailtxt,Phonetxt);
					}
					} catch (SQLException ex) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, ex.toString());
					}		
			}
		});
=======
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		JButton btnUpdate = new JButton("Update\r\n");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edita.png"));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnUpdate.setFocusable(false);
		btnUpdate.setFocusTraversalKeysEnabled(false);
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setBackground(new Color(7, 43, 95));
		btnUpdate.setBounds(10, 96, 203, 34);
		panelbotones.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\delete.png"));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnDelete.setFocusable(false);
		btnDelete.setFocusTraversalKeysEnabled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(7, 43, 95));
		btnDelete.setBounds(10, 141, 203, 34);
		panelbotones.add(btnDelete);
		
		JButton btnNew = new JButton("New");
		btnNew.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\add.png"));
		btnNew.setForeground(Color.WHITE);
		btnNew.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNew.setFocusable(false);
		btnNew.setFocusTraversalKeysEnabled(false);
		btnNew.setFocusPainted(false);
		btnNew.setBorderPainted(false);
		btnNew.setBackground(new Color(7, 43, 95));
		btnNew.setBounds(10, 184, 203, 34);
		panelbotones.add(btnNew);
		
<<<<<<< HEAD
=======
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBounds(10, 284, 461, 152);
		add(panelTable);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBackground(new Color(0, 0, 64));
		tableSeparator.setBounds(0, 150, 461, 10);
		panelTable.add(tableSeparator);
		
<<<<<<< HEAD
=======
		table = new JTable();
		table.setGridColor(UIManager.getColor("ScrollBar.background"));
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(0, 0, 439, 0);
		panelTable.add(table);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(10, 11, 441, 130);
		panelTable.add(scrollPane);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblDoctors = new JLabel("Doctors");
		lblDoctors.setForeground(new Color(0, 0, 64));
		lblDoctors.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblDoctors.setBounds(11, 11, 71, 14);
		add(lblDoctors);
		
		JLabel lblRegisteredPatients = new JLabel("Registered Doctors");
		lblRegisteredPatients.setForeground(new Color(0, 0, 64));
		lblRegisteredPatients.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblRegisteredPatients.setBounds(10, 264, 148, 14);
		add(lblRegisteredPatients);
		
<<<<<<< HEAD
		panelDoctor = new JPanel();
		panelDoctor.setLayout(null);
		panelDoctor.setBackground(new Color(251, 251, 251));
		panelDoctor.setBounds(10, 30, 228, 229);
		add(panelDoctor);
=======
		JPanel panelpacientes = new JPanel();
		panelpacientes.setLayout(null);
		panelpacientes.setBackground(new Color(251, 251, 251));
		panelpacientes.setBounds(10, 30, 228, 229);
		add(panelpacientes);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
<<<<<<< HEAD
		panelDoctor.add(separator);
=======
		panelpacientes.add(separator);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblname = new JLabel("Name:");
		lblname.setForeground(new Color(5, 30, 67));
		lblname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblname.setBounds(10, 22, 131, 14);
<<<<<<< HEAD
		panelDoctor.add(lblname);
		
		Nametxt = new JTextField();
		Nametxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Nametxt.setColumns(10);
		Nametxt.setBackground(UIManager.getColor("Button.background"));
		Nametxt.setBounds(10, 40, 101, 20);
		panelDoctor.add(Nametxt);
=======
		panelpacientes.add(lblname);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setBounds(10, 40, 101, 20);
		panelpacientes.add(textField);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblphone = new JLabel("Specialty");
		lblphone.setForeground(new Color(5, 30, 67));
		lblphone.setFont(new Font("Roboto", Font.BOLD, 11));
		lblphone.setBounds(10, 65, 131, 14);
<<<<<<< HEAD
		panelDoctor.add(lblphone);
=======
		panelpacientes.add(lblphone);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setForeground(new Color(5, 30, 67));
		lblemail.setFont(new Font("Roboto", Font.BOLD, 11));
		lblemail.setBounds(9, 111, 125, 14);
<<<<<<< HEAD
		panelDoctor.add(lblemail);
		
		Emailtxt = new JTextField();
		Emailtxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Emailtxt.setColumns(10);
		Emailtxt.setBackground(UIManager.getColor("Button.background"));
		Emailtxt.setBounds(9, 129, 209, 20);
		panelDoctor.add(Emailtxt);
=======
		panelpacientes.add(lblemail);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBackground(UIManager.getColor("Button.background"));
		textField_2.setBounds(9, 129, 209, 20);
		panelpacientes.add(textField_2);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblproname = new JLabel("Proname");
		lblproname.setForeground(new Color(5, 30, 67));
		lblproname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblproname.setBounds(120, 22, 131, 14);
<<<<<<< HEAD
		panelDoctor.add(lblproname);
		
		LastNametxt = new JTextField();
		LastNametxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		LastNametxt.setColumns(10);
		LastNametxt.setBackground(UIManager.getColor("Button.background"));
		LastNametxt.setBounds(120, 40, 98, 20);
		panelDoctor.add(LastNametxt);
=======
		panelpacientes.add(lblproname);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBounds(120, 40, 98, 20);
		panelpacientes.add(textField_3);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JLabel lblid = new JLabel("Phone:");
		lblid.setForeground(new Color(5, 30, 67));
		lblid.setFont(new Font("Roboto", Font.BOLD, 11));
		lblid.setBounds(10, 156, 46, 14);
<<<<<<< HEAD
		panelDoctor.add(lblid);
		
		Phonetxt = new JTextField();
		Phonetxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Phonetxt.setColumns(10);
		Phonetxt.setBackground(UIManager.getColor("Button.background"));
		Phonetxt.setBounds(10, 175, 208, 20);
		panelDoctor.add(Phonetxt);
		
		panelDoctor.add(comboBx_Especialidad);
	}
}
=======
		panelpacientes.add(lblid);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBackground(UIManager.getColor("Button.background"));
		textField_5.setBounds(10, 175, 208, 20);
		panelpacientes.add(textField_5);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setFocusable(false);
		comboBox.setFocusTraversalKeysEnabled(false);
		comboBox.setLightWeightPopupEnabled(false);
		comboBox.setBackground(UIManager.getColor("Button.background"));
		comboBox.setBounds(11, 83, 206, 22);
		panelpacientes.add(comboBox);
	}

}
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
