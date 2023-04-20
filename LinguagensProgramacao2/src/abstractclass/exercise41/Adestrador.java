/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise41;

import java.util.Random;

/**
 *
 * @author maumneto
 */
public class Adestrador {
    public Animal adestrarAnimal() {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal animais[] = {gato, cachorro};
        
        int value = new Random().nextInt(animais.length);
        
        if (animais[value].equals(gato)) {
            return gato;
        } else {
            return cachorro;
        }
    }
    
    public void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}
