

package MenuRegisters;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ConexionBD.Conexion;
import MenuAdmin.JMenuAdmin;
import MenuShow.DoctorsShow;
import ToolsMethods.Tools;

import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterDoctor extends JPanel {

	private static final long serialVersionUID = 1L;
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
		
		//ComboBox de Especialidad
		JComboBox<Object> comboBx_Especialidad = new JComboBox<Object>();
		t.CmbSpecialty(comboBx_Especialidad);
		comboBx_Especialidad.setFocusable(false);
		comboBx_Especialidad.setFocusTraversalKeysEnabled(false);
		comboBx_Especialidad.setLightWeightPopupEnabled(false);
		comboBx_Especialidad.setBackground(UIManager.getColor("Button.background"));
		comboBx_Especialidad.setBounds(11, 83, 206, 22);
		
			// Estilizado del boton:		
		JButton btnSave = new JButton("Save");
		btnSave.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\diskette.png"));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnSave.setFocusable(false);
		btnSave.setFocusTraversalKeysEnabled(false);
		btnSave.setFocusPainted(false);
		btnSave.setBorderPainted(false);
		btnSave.setBackground(new Color(7, 43, 95));		
		btnSave.setBounds(10, 11, 203, 34);	
		panelbotones.add(btnSave);
		
			// Evento de Save: 
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int comboBox_ID = comboBx_Especialidad.getSelectedIndex() + 1;

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
									try {				
										Statement sql2 = Conexion.EstablecerConexion().createStatement();
										String consulta2 = "Insert into Doctores (Nombres,Apellido,EspecialidadID,Email,Telefono)values("
										
											+ "'" + Nametxt.getText()+"'," 	
											+ "'" + LastNametxt.getText()+"',"
											+ "'" + comboBox_ID + "',"
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
		
		// Panel que contiene la tabla
		panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBounds(10, 284, 461, 152);
		add(panelTable);	
				
		DefaultTableModel modelo = t.MostrarTablaPacientes("Doctores");
		
				// Tabla de muestra
				DoctorTable = new JTable(modelo);
				DoctorTable.setGridColor(UIManager.getColor("ScrollBar.background"));
				DoctorTable.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				DoctorTable.setBounds(0, 0, 439, 0);
				panelTable.add(DoctorTable);
				
				JScrollPane scrollPane = new JScrollPane((Component) null);
				scrollPane.setBounds(10, 11, 441, 130);
				panelTable.add(scrollPane);
					//Evento de show	
		btnShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DoctorsShow D = new DoctorsShow(instanciaJMenuAdmin);
				D.ShowVentana();
				
				try {
					Statement sql3 = Conexion.EstablecerConexion().createStatement();
					String consulta3 = "Select *from Doctores";
					
					ResultSet Datos_Doc = sql3.executeQuery(consulta3);
					
					// Esto es para la tabla de Preview inmediato
					int columnas = Datos_Doc.getMetaData().getColumnCount();
					
					String Especialidad_Item = (String)comboBx_Especialidad.getSelectedItem();
					
					for (int i = 1; i < columnas; i++ ) {
							modelo.addColumn(Datos_Doc.getMetaData().getColumnName(i));
						}
					while (Datos_Doc.next()) {
						Object[] nuevaFila = {Nametxt.getText(), LastNametxt.getText(), Especialidad_Item,
								Emailtxt.getText(), Phonetxt.getText()};
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
		
		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
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
		
		
		JSeparator tableSeparator = new JSeparator();
		tableSeparator.setBackground(new Color(0, 0, 64));
		tableSeparator.setBounds(0, 150, 461, 10);
		panelTable.add(tableSeparator);
		
		
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
		
		panelDoctor = new JPanel();
		panelDoctor.setLayout(null);
		panelDoctor.setBackground(new Color(251, 251, 251));
		panelDoctor.setBounds(10, 30, 228, 229);
		add(panelDoctor);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(0, 226, 226, 10);
		panelDoctor.add(separator);
		
		JLabel lblname = new JLabel("Name:");
		lblname.setForeground(new Color(5, 30, 67));
		lblname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblname.setBounds(10, 22, 131, 14);
		panelDoctor.add(lblname);
		
		Nametxt = new JTextField();
		Nametxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Nametxt.setColumns(10);
		Nametxt.setBackground(UIManager.getColor("Button.background"));
		Nametxt.setBounds(10, 40, 101, 20);
		panelDoctor.add(Nametxt);
		
		JLabel lblphone = new JLabel("Specialty");
		lblphone.setForeground(new Color(5, 30, 67));
		lblphone.setFont(new Font("Roboto", Font.BOLD, 11));
		lblphone.setBounds(10, 65, 131, 14);
		panelDoctor.add(lblphone);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setForeground(new Color(5, 30, 67));
		lblemail.setFont(new Font("Roboto", Font.BOLD, 11));
		lblemail.setBounds(9, 111, 125, 14);
		panelDoctor.add(lblemail);
		
		Emailtxt = new JTextField();
		Emailtxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Emailtxt.setColumns(10);
		Emailtxt.setBackground(UIManager.getColor("Button.background"));
		Emailtxt.setBounds(9, 129, 209, 20);
		panelDoctor.add(Emailtxt);
		
		JLabel lblproname = new JLabel("Proname");
		lblproname.setForeground(new Color(5, 30, 67));
		lblproname.setFont(new Font("Roboto", Font.BOLD, 11));
		lblproname.setBounds(120, 22, 131, 14);
		panelDoctor.add(lblproname);
		
		LastNametxt = new JTextField();
		LastNametxt.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		LastNametxt.setColumns(10);
		LastNametxt.setBackground(UIManager.getColor("Button.background"));
		LastNametxt.setBounds(120, 40, 98, 20);
		panelDoctor.add(LastNametxt);
		
		JLabel lblid = new JLabel("Phone:");
		lblid.setForeground(new Color(5, 30, 67));
		lblid.setFont(new Font("Roboto", Font.BOLD, 11));
		lblid.setBounds(10, 156, 46, 14);
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