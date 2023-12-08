package ToolsMethods;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ConexionBD.Conexion;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}

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
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return modelo;
		}
	
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
			Statement sql = Conexion.EstablecerConexion().createStatement();
			sql.executeUpdate(consulta);
			
			sql.close();
			Conexion.EstablecerConexion().close();
			
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	
	public DefaultTableModel ShowPacientesByNombre( String nombre) {
		
		DefaultTableModel modelo = new DefaultTableModel();
		try {
			String consulta = "SELECT * FROM Pacientes WHERE Nombre LIKE '%" + nombre + "%';";
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
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
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
	                	Tiempo = "AMito";
	                }
	                
	                lbl.setText(String.format("%02d:%02d ", hora, minutos) + Tiempo);
	            }
	        };

	        timer.schedule(actualizarHora, 0, 1000);
	    }
	
	
	public void CmbSpecialty(JComboBox<Object> cmb) {
		  String query = "SELECT Nombre FROM Especialidad;";

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
	
}
	


	

