/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise03;

/**
 *
 * @author maumneto
 */
public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    
    public ContaCorrenteEspecial(double montante, String nome) {
        super(montante, nome);
    }

    @Override
    public void sacar(double quantia) {
        if (1.001*quantia > montante) {
            System.out.println("Não é possível sacar essa quantia.");
        } else {
            montante -= 1.001*quantia;
        }
    }
    
}
