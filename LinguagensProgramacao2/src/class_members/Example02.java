/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_members;

/**
 *
 * @author maumneto
 */
public class Example02 {
    
    public static int contador = 1;
    
    public static int incrementarContador() {
        return contador++;
    }
    
    public static void main(String[] args) {
        System.out.println("Valor contador: " + Example02.contador);
        Example02.incrementarContador();
        System.out.println("Valor contador: " + Example02.contador);
    }
 
}
