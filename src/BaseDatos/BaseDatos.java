package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {

	private final String URL = "jdbc:mysql://localhost/";
	private final String DB = "transportejava";
	private final String USUARIO = "root";
	private final String PASS = "";
	
	public Connection conexion = null;
	

	@SuppressWarnings("finally")
	public  Connection conectar() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(URL+DB, USUARIO, PASS);
			if(conexion!=null){
				System.out.println("La conexión se ejecutó exitosamente");
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			return conexion;
		}
	}
	
	public void  desconectar() throws SQLException {
		conexion.close();
	}

}
