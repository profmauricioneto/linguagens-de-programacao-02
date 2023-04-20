/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise03;

/**
 *
 * @author maumneto
 */
public class BancoUnichristus {
    public static void main(String[] args) {
        ContaCorrente geanConta = new ContaCorrente(3000, "Gean");
        System.out.println("Usuario: " +geanConta.getNome());
        System.out.println("Saldo: " + geanConta.saldo());
        geanConta.depositar(1000);
        System.out.println("Saldo: " + geanConta.saldo());
        geanConta.sacar(3000);
        System.out.println("Saldo: " + geanConta.saldo());
        
        System.out.println("====================");
        
        ContaCorrente rosaConta = new ContaCorrenteEspecial(5000, "Rosa");
        System.out.println("Usuario: " + rosaConta.getNome());
        System.out.println("Saldo: " + rosaConta.saldo());
        rosaConta.depositar(10000);
        System.out.println("Saldo: " + rosaConta.saldo());
        rosaConta.sacar(3000);
        System.out.println("Saldo: " + rosaConta.saldo());

    }
}
