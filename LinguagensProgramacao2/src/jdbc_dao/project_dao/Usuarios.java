/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_dao.project_dao;

import java.util.Calendar;

/**
 *
 * @author mauricio.moreira
 */
public class Usuarios {
    private long id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataNascimento;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;   
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;   
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;   
    }

    public long getId() {
        return id;
    }
        
    public void setId(long id) {
        this.id = id;   
    }
   
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;   
    }
}
