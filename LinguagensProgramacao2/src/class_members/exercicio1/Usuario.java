/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_members.exercicio1;

/**
 *
 * @author maumneto
 */
public class Usuario {
    public static int id = 0;
    
    public static int incrementarId() {
        return Usuario.id++;
}
    
    public Usuario() {
        Usuario.incrementarId();
    }
}
