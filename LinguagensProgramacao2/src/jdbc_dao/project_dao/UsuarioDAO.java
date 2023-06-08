/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_dao.project_dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author mauricio.moreira
 */
public class UsuarioDAO {

    private Connection connection;

    /**
     * constructor
     */
    public UsuarioDAO() {
        this.connection = new ConnectionDB().getConnection();
    }

    /**
     *
     * @param usuario
     */
    public void addUsuario(Usuarios usuario) {
        String sql = "INSERT INTO usuarios (nome, email, endereco, dataNascimento) VALUES (?,?,?,?)";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);

            state.setString(1, usuario.getNome());
            state.setString(2, usuario.getEmail());
            state.setString(3, usuario.getEndereco());
            state.setDate(4, new Date(usuario.getDataNascimento().getTimeInMillis()));

            state.execute();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param void
     */
    public void mostrarUsuario() {
        String sql = "SELECT * FROM usuarios";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            ResultSet result;
            result = state.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("dataNascimento"));
                System.out.println(" -------- ");
            }
            result.close();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param id
     */
    public void delete(long id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setLong(1, id);
            state.execute();
            state.close();
            System.out.println("tupla deletada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param usuario
     * @param id
     */
    public void update(Usuarios usuario, long id) {
        String sql = "UPDATE usuarios SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setString(1, usuario.getNome());
            state.setString(2, usuario.getEmail());
            state.setString(3, usuario.getEndereco());
            state.setDate(4, new Date(usuario.getDataNascimento().getTimeInMillis()));
            state.setLong(5, id);
            state.execute();
            state.close();
            System.out.println("tupla atualizada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param void
     */
    public void mostrarTodosDadosDAO() {
        String procedure = "{call SelectAllData()}";
        try {
            CallableStatement callable;
            callable = connection.prepareCall(procedure);
            ResultSet result = callable.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("dataNascimento"));
                System.out.println(" -------- ");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarPorId(long id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try {
            PreparedStatement state;
            state = connection.prepareStatement(sql);
            state.setLong(1, id);
            ResultSet result;
            result = state.executeQuery();
            while (result.next()) {
                System.out.println(" ");
                System.out.println("ID: " + result.getLong("id"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Endereco: " + result.getString("endereco"));
                System.out.println("Data: " + result.getString("dataNascimento"));
                System.out.println(" -------- ");
            }
            result.close();
            state.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param void
     */
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
