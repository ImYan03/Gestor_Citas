package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public Conexion() {
		// TODO Auto-generated constructor stub
	}

	public static Connection EstablecerConexion() {
		
		String url = "jdbc:sqlserver://localhost:1433;"
				+ "database= NOMBREBASEDEDATOS;"
				+ "user= NOMBRE USUARIO;"
				+ "password= CONTRASEÑA;"
				+ "loginTimeout=1;"
				+ "encrypt=true;trustServerCertificate=true;";
		
		try {
			return DriverManager.getConnection(url);
		}catch(SQLException ex) {
			System.out.println(ex.toString());
			return null;	
		}
		
		
	}
	
}
