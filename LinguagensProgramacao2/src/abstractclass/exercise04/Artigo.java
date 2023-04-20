/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise04;

/**
 *
 * @author maumneto
 */
public class Artigo implements ABNT {
    private String conclusao;
    private String titulo;
    
    public Artigo(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public void criarSumario(){
        System.out.println("Sumário do Artigo: " + titulo);
    }

    @Override
    public void definirEspacamento() {
        System.out.println("Espaçamento do Artigo:" + titulo);
    }

    @Override
    public void referenciar() {
        System.out.println("Referencias do Artigo: " + titulo);
    }
    
    public void criarResumo() {
        System.out.println("Resumo do Artigo");
    }
}
