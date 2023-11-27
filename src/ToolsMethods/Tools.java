package ToolsMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	
	
}
	

