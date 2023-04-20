/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise04;

/**
 *
 * @author maumneto
 */
public class Livro implements ABNT {
    private int codigo;
    private String titulo;

    
    public Livro(String titulo){
        this.titulo = titulo;
    }

    @Override
    public void criarSumario() {
        System.out.println("Sumário do Livro: " + titulo);
    }

    @Override
    public void definirEspacamento() {
        System.out.println("Espaçamento do Livro: " + titulo);
    }

    @Override
    public void referenciar() {
        System.out.println("Referencias do Livro: " + titulo);
    }
    
    public void elaborarCapa(){
        System.out.println("Capa do Livro");
    }
}
