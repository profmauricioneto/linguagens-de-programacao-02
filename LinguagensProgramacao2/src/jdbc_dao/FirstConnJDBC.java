
package jdbc_dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * @author maumneto
 */
public class FirstConnJDBC {
    private final String connectionURL = "jdbc:mysql://localhost:3306/examplesingleton";
    private String login = "root";
    private String password = "mauricio123";
    private Connection connection;
    private static FirstConnJDBC instance ;
    
    private FirstConnJDBC() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(connectionURL, login, password);
            System.out.println("Driver Carregado!");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getCause());
        }
    }
    
    public static FirstConnJDBC getInstanceJDBC() throws SQLException {
        if (instance ==  null) {
            instance = new FirstConnJDBC();
            System.out.println("Nova Conexão!");
        }
        return instance;
        
    }
}
