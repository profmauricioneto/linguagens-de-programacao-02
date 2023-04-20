/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise41;

/**
 *
 * @author maumneto
 */
public class Gato extends Animal {

    @Override
    public String emitirSom() {
        return "miando...";
    }

    @Override
    public void mover() {
        System.out.println("Gato se movendo");
    }

    @Override
    public void descansar() {
        System.out.println("Gato descansando");
    }
    
}
