package designpatterns.singleton.connectiondb;

import java.sql.SQLException;

/**
 *
 * @author maumneto
 */
public class ConnectionDBExample {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionBySingleton conn;
        ConnectionBySingleton conn2;
        try {
            conn = ConnectionBySingleton.getInstance();
            System.out.println(conn);
            conn2 = ConnectionBySingleton.getInstance();
            System.out.println(conn2);
            if (conn == conn2) {
                System.out.println("Instancias iguais!");
            } else {
                System.out.println("Instancias não iguais!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
    }
}
