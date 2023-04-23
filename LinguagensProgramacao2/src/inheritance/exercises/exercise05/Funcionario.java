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
public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> vendas = new ArrayList<>();

    public Funcionario(double salario, int codigo) {
        super(codigo);
        this.salario = salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addVendaFuncionario(Venda venda) {
        vendas.add(venda);
    }
    
    public int quantidadeVendasFuncionario() {
        return vendas.size();
    }
}
