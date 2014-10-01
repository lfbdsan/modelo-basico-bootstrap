package bibliotecaLivros.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
		
	public static Connection createConnection() throws SQLException{ 
		String url = "jdbc:mysql://localhost/java"; 
		//Nome da base de dados 
		String user = "root"; //nome do usu�rio do MySQL 
		String password = ""; //senha do MySQL 
		Connection conexao = null;
		
		conexao = DriverManager.getConnection(url, user, password); 
		return conexao; 
		}
}
