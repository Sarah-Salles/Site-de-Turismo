package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Salles1463@";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/freedom";

    public static Connection createConnectionToMySQL() throws SQLException {
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	} catch (ClassNotFoundException e) {
    	    throw new RuntimeException(e);
    	}

        return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);

    }
}
