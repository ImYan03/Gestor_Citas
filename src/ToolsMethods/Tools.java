package ToolsMethods;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
<<<<<<< HEAD
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
=======

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
import javax.swing.table.DefaultTableModel;
import ConexionBD.Conexion;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
		int id2;
	public DefaultTableModel MostrarTabla(String Tabla) {
		
		DefaultTableModel modelo = new DefaultTableModel(); // crear modelo de la tabla
			try {
				
				String consulta = "SELECT * FROM " + Tabla; //crear consulta
				
				Statement sql = Conexion.EstablecerConexion().createStatement(); //crear statement para consulta
				
				ResultSet tabla = sql.executeQuery(consulta); //Guardar los datos de la consulta en un result 
				
				int columnas = tabla.getMetaData().getColumnCount(); //Guardar el numero de columnas de la tabla
				
				for(int i = 1; i<=columnas; i++) {
					modelo.addColumn(tabla.getMetaData().getColumnName(i)); //Agregamos las columnas al modelo
				}	
				
				while (tabla.next()) {
					Object[] fila = new Object[columnas]; //creamos un vector para almacenar filas
					for(int i = 1; i<=columnas; i++) { //recorremos columnas
						fila[i-1] = tabla.getObject(i); //agregar las filas al vector
					}
					modelo.addRow(fila); //añadir el vector al modelo
=======

	public DefaultTableModel MostrarTablaPacientes() {
			
		DefaultTableModel modelo = new DefaultTableModel();
			try {
				
				String consulta = "select * from Pacientes";
				Statement sql = Conexion.EstablecerConexion().createStatement();
				ResultSet tabla = sql.executeQuery(consulta);
				int columnas = tabla.getMetaData().getColumnCount();
				for(int i = 1; i<=columnas; i++) {
					modelo.addColumn(tabla.getMetaData().getColumnName(i));
				}
				
				while (tabla.next()) {
					Object[] fila = new Object[columnas];
					for(int i = 1; i<=columnas; i++) {
						fila[i-1] = tabla.getObject(i);
					}
					modelo.addRow(fila);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return modelo;
		}
	
<<<<<<< HEAD
	
	
	public void ActualizarDatos(String NombreTabla, int id, String column, Object object,String WhereColumn ) {
		 try {
			 String consulta = "UPDATE " +  NombreTabla + " SET "+ column +" = " + "'" + object +"'" + " Where "+ WhereColumn +" = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	//Sobrecarga del metodo para aceptar enteros
	public void ActualizarDatos(int id, String column, int nuevodato, String NombreTabla, String WhereColumn) {
		 try {
			 String consulta = "UPDATE "+ NombreTabla +" SET "+ column +" = " + "'" +nuevodato+"'" + " Where "+WhereColumn +" PacienteID = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	//Sobrecarga para el comboBox
	public void ActualizarDatos(String NombreTabla, int id, String column, String Especialidad,String WhereColumn ) {
		 try {
			 String consulta = "UPDATE " +  NombreTabla + " SET "+ column +" = " + "'" + Especialidad+"'" + " Where "+ WhereColumn +" = '" + id + "'";
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	public void EliminarDatos(int id, String Tabla, String Columna) {
		try {
			String consulta = "DELETE FROM "+ Tabla +" Where "+ Columna +" = " + id + ";";
=======
	public void MostrarTablaUsuarios(DefaultTableModel modelo) {
		try {
			String consulta = "Select * From Usuario;";
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet tabla = sql.executeQuery(consulta);
			int columnas = tabla.getMetaData().getColumnCount();
			for(int i = 1; i<=columnas; i++) {
				modelo.addColumn(tabla.getMetaData().getColumnName(i));
			}
			
			while (tabla.next()) {
				Object[] fila = new Object[columnas];
				for(int i = 1; i<=columnas; i++) {
					fila[i-1] = tabla.getObject(i);
				}
				modelo.addRow(fila);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ActualizarDatosPacientes(int id, String column, String nuevodato ) {
		 try {
			 String consulta = "UPDATE Pacientes SET "+ column +" = " + "'" +nuevodato+"'" + " Where PacienteID = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	public void ActualizarDatosPacientes(int id, String column, int nuevodato ) {
		 try {
			 String consulta = "UPDATE Pacientes SET "+ column +" = " + "'" +nuevodato+"'" + " Where PacienteID = " + id;
			 Statement sql = Conexion.EstablecerConexion().createStatement();
			 sql.executeUpdate(consulta);
			 
			 sql.close();
			 Conexion.EstablecerConexion().close();
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	}
	
	public void EliminarDatosPacientes(int id) {
		try {
			String consulta = "DELETE FROM Pacientes Where PacienteID = " + id + ";";
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
			Statement sql = Conexion.EstablecerConexion().createStatement();
			sql.executeUpdate(consulta);
			
			sql.close();
			Conexion.EstablecerConexion().close();
			
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	
<<<<<<< HEAD
	public DefaultTableModel FilterTable( String nombre, String Tabla, String Columna) {
		
		DefaultTableModel modelo = new DefaultTableModel();
		try {
			String consulta = "SELECT * FROM "+ Tabla +" WHERE "+ Columna +" LIKE '%" + nombre + "%';";
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet tabla = sql.executeQuery(consulta);
			
			int columnas = tabla.getMetaData().getColumnCount();
			
=======
	public DefaultTableModel ShowPacientesByNombre( String nombre) {
		
		DefaultTableModel modelo = new DefaultTableModel();
		try {
			String consulta = "SELECT * FROM Pacientes WHERE Nombre LIKE '%" + nombre + "%';";
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet tabla = sql.executeQuery(consulta);
			int columnas = tabla.getMetaData().getColumnCount();
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
			for(int i = 1; i<=columnas; i++) {
				modelo.addColumn(tabla.getMetaData().getColumnName(i));
			}
			
			while (tabla.next()) {
				Object[] fila = new Object[columnas];
				for(int i = 1; i<=columnas; i++) {
					fila[i-1] = tabla.getObject(i);
				}
				modelo.addRow(fila);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		modelo.fireTableDataChanged();
		return modelo;
	}
	
	public void pintarBotones(JButton btn) {
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(new Color(200, 211, 227));
				btn.setForeground(new Color(7, 43, 95));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(new Color(7, 43, 95));
				btn.setForeground(new Color(255,255,255));
			}
		});
	}
	
<<<<<<< HEAD
	public void pintarPanelYLabel(JPanel panel, JLabel label, JLabel Img, Color color1, Color color2) {
=======
	public void CambiarImagen(JPanel panel, JLabel Img, JLabel ImgChanged) {
		Color color = new Color(245,245,245);
		if(panel.getBackground().equals(color)) {
			Img.setVisible(false);
			ImgChanged.setVisible(true);
		}else {
			Img.setVisible(true);
			ImgChanged.setVisible(false);
		}
	}
	
	public void pintarPanelYLabel(JPanel panel, JLabel label, JLabel Img, JLabel ImgChanged) {
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
<<<<<<< HEAD
				panel.setBackground(color1);
				label.setForeground(color2);
				Img.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(color2);
				label.setForeground(color1);
				Img.setVisible(true);
			}
		});
	}	
	public void GetData(JLabel lbl, String Table) {
		String consulta = "SELECT COUNT(*) AS Total FROM "+ Table +";";
=======
				panel.setBackground(new Color(245,245,245));
				label.setForeground(new Color(7, 43, 95));
				CambiarImagen(panel, Img, ImgChanged);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(10, 59, 129));
				label.setForeground(new Color(255,255,255));
				CambiarImagen(panel, Img, ImgChanged);
			}
		});
	}
	
	public void GetCantClients(JLabel lbl) {
		String consulta = "SELECT COUNT(*) AS Total FROM Pacientes;";
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		try {
			Statement sql = Conexion.EstablecerConexion().createStatement();
			ResultSet result = sql.executeQuery(consulta);
			int num;
			String numS;
			while(result.next()) {
				num = result.getInt("Total");
				numS = String.valueOf(num); 
				lbl.setText(numS);
			}
			
			sql.close();
			Conexion.EstablecerConexion().close();
			
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null,ex);
		}
	}
	
	public void ObtenerHora(JLabel lbl) {
		
		 Timer timer = new Timer();
	        TimerTask actualizarHora = new TimerTask() {
	            public void run() {
	            	int hora;
	        		int minutos;
	                LocalTime horaActual = LocalTime.now();
	                hora = horaActual.getHour();
	                minutos = horaActual.getMinute();
	                String Tiempo = "";
	                if(hora>=12) {
	                	Tiempo = "PM";
	                }else {
<<<<<<< HEAD
	                	Tiempo = "AM";
=======
	                	Tiempo = "AMito";
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
	                }
	                
	                lbl.setText(String.format("%02d:%02d ", hora, minutos) + Tiempo);
	            }
	        };

	        timer.schedule(actualizarHora, 0, 1000);
	    }
<<<<<<< HEAD
	
	
	public void CmbSpecialty(JComboBox<Object> cmb, String Tabla, String Columna) {
		  String query = "SELECT "+ Columna +" FROM "+ Tabla +";";

		    try {
		        Statement sql = Conexion.EstablecerConexion().createStatement();
		        ResultSet res = sql.executeQuery(query);
		        
		        ComboBoxModel<Object> model = new DefaultComboBoxModel<>(); // Crear un modelo de ComboBox
		        
		        while (res.next()) {
		            String nombreEspecialidad = res.getString("Nombre");
		            ((DefaultComboBoxModel<Object>) model).addElement(nombreEspecialidad); // Agregar cada nombre de especialidad al modelo
		        }

		        cmb.setModel(model); // Establecer el modelo en el JComboBox

		    } catch (SQLException e) {
		        e.printStackTrace(); // Manejo básico de excepciones
		    }
		
	}
	
	public void LimpiarCampos(JTextField Name,JTextField LastName,
			JTextField Email,JTextField Phone) {
			Name.setText(null);
			LastName.setText(null);
			Email.setText(null);
			Phone.setText(null);
		}
=======
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
}
	


<<<<<<< HEAD
	
=======
	

>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
