/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicoop;

/**
 *
 * @author maumneto
 */
public class Carro {
    int quantidadeDePneus;
    int quantidadeDePortas;
    String cor;
    
    public Carro() {
        System.out.println("Instancia de Carro sendo criada!");
    }
    
    void acelerar() {
        System.out.println("Acelerando!");
    }
    void frear() {
        System.out.println("Freando!");
    }
}
