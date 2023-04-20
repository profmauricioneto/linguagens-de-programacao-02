/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise04;

/**
 *
 * @author maumneto
 */
public class TesteQuestao4 {
    public static void main(String[] args) {
        Livro lordsOfRings = new Livro("Lords of Rings");
        Artigo bitcoin = new Artigo("BitCoin: a distributed coin...");
        
        lordsOfRings.criarSumario();
        lordsOfRings.definirEspacamento();
        lordsOfRings.referenciar();
        System.out.println("=============");
        bitcoin.criarSumario();
        bitcoin.definirEspacamento();
        bitcoin.referenciar();
    }
}
