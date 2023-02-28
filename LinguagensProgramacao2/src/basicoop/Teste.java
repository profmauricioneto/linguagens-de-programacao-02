/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicoop;

/**
 *
 * @author maumneto
 */
public class Teste {
    public static void main(String[] args) {
        System.out.println("Carro Maria");
        Carro carroMaria = new Carro();
        carroMaria.quantidadeDePneus = 4;
        carroMaria.quantidadeDePortas = 2;
        carroMaria.cor = "azul";
        
        System.out.println("Pneus: "+ carroMaria.quantidadeDePneus);
        System.out.println("Porta: "+ carroMaria.quantidadeDePortas);
        System.out.println("Cor: "+ carroMaria.cor);
        carroMaria.acelerar();
        carroMaria.frear();
                       
        System.out.println("Carro João");
        Carro carroJoao = new Carro();
        carroJoao.quantidadeDePneus = 4;
        carroJoao.quantidadeDePortas = 4;
        carroJoao.cor = "vermelho";
        
        System.out.println("Pneus: "+ carroJoao.quantidadeDePneus);
        System.out.println("Porta: "+ carroJoao.quantidadeDePortas);
        System.out.println("Cor: "+ carroJoao.cor);
        carroJoao.acelerar();
        carroJoao.frear();
    }
}
