/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.example01;


public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + getNome());
    }
    
    public String getNome() {
        return nome;
    }
    
}
