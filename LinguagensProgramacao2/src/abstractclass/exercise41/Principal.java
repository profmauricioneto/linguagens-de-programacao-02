/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise41;

/**
 *
 * @author maumneto
 */
public class Principal {
    public static void main(String[] args) {
        Adestrador adestrador = new Adestrador();
        
        for(int i = 1; i <= 10; i++) {
            Animal animal = adestrador.adestrarAnimal();
            adestrador.brincar(animal);
        }
    }
}
