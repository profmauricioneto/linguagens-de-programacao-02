
package jdbc_dao;

import java.sql.*;
/**
 *
 * @author maumneto
 */
public class TestJDBC {
    public static void main(String[] args) {
        try {
            FirstConnJDBC conn = FirstConnJDBC.getInstanceJDBC();
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.err.println(e.getCause());
        }
    }
}
