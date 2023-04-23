/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.exercises.exercise05;

import java.util.Date;

/**
 *
 * @author newaccount
 */
public class Venda {
    private int codigo;
    public Date data;
    public Cliente cliente;
    public Funcionario funcionario;
    
    public Venda(int codigo, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    
    public int getCodigo() {
        return codigo;
    }
}
