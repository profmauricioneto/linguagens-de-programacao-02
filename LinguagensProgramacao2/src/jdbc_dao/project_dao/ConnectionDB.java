/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_dao.project_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.jdbc.Driver;
/**
 *
 * @author mauricio.moreira
 */
public class ConnectionDB {
    private static ConnectionDB instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/projectjdbcdao";
    private String username = "root";
    private String password = "mauricio123";
    
    public ConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexão falhou. Erro: " + e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static ConnectionDB getInstance() throws SQLException {
        Connection conn;
        if (instance == null) {
            instance = new ConnectionDB();
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Instancia já criada!");
        }
        return instance;
    }
}
