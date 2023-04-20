/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise41;

/**
 *
 * @author maumneto
 */
public class Cachorro extends Animal {

    @Override
    public String emitirSom() {
        return "latindo...";
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se movendo");
    }

    @Override
    public void descansar() {
        System.out.println("Cachorro descansando");
    }
    
}
