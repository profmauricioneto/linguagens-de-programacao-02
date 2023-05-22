/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton.connectiondb;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class ConnectionBySingleton {
    private static ConnectionBySingleton instance;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/myschemedb?useSSL=true";
    private String username;
    private String password;
    Console console;
    Scanner input;
    
    private ConnectionBySingleton() throws SQLException {
        input = new Scanner(System.in);
        console = System.console();
        if (console == null) {
            System.out.println("Console Unavailable!");
        }
        
        try {
            System.out.print("Username: ");
            String username = input.next();
            char[] password_console = console.readPassword("Password: ");
            
            setUsername(username);
            setPassword(new String(password_console));
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, getUsername(), getPassword());
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed.");
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static ConnectionBySingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionBySingleton();
            System.out.println("Conexão realizada com sucesso!");
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectionBySingleton();
        }
        return instance;
    }    
}
