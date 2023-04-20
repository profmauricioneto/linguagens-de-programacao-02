/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise03;

/**
 *
 * @author maumneto
 */
public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    protected double montante;
    protected String nome;
    protected int id;
    
    public ContaCorrente(String nome) {
        this.nome = nome;
        this.montante = 0;
        this.id = 0;
    }
    
    public ContaCorrente(double montante, String nome) {
        this.nome = nome;
        this.montante = montante;
        this.id = 0;
    }
    
    @Override
    public void depositar(double quantia) {
        montante += quantia;
    }

    @Override
    public void sacar(double quantia) {
        if (1.005*quantia > montante) {
            System.out.println("Não é possível sacar essa quantia.");
        } else {
            montante -= 1.005*quantia;
        }
    }

    @Override
    public double saldo() {
        return montante;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
}
