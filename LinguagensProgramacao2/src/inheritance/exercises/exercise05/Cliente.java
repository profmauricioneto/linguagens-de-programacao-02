/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.exercises.exercise05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author newaccount
 */
public class Cliente extends Pessoa {
    private String email;
    public List<Venda> vendas = new ArrayList<>();

    public Cliente(String email, int codigo) {
        super(codigo);
        this.email = email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addVendaCliente(Venda venda) {
        vendas.add(venda);
    }
    
    public int quantidadeVendasCliente() {
        return vendas.size();
    }
}
