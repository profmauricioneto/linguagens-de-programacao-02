/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.example01;

/**
 *
 * @author maumneto
 */
public class Funcionario extends Pessoa {
     private double salario;

    public Funcionario(String nome) {
        super(nome);
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario " + getNome());
    }   
}
